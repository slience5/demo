package concurrent;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import com.github.benmanes.caffeine.cache.RemovalCause;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public class CaffineTest {

    public static void main(String[] args) {
        /**
         * 手动操作型缓存
         */
        Cache<String,Object> cache = Caffeine.newBuilder()
                                    .maximumSize(2) // 最多两个Entry
                                    .expireAfterWrite(Duration.ofSeconds(5)) // 5s自动过期
                                    .recordStats() // 开启调用统计
                                    .build();

        cache.put("key1","val1");
        cache.put("key2","val2");

        System.out.println(cache.estimatedSize()); // 2
        cache.getIfPresent("key1");

        cache.put("key3","val3"); // 此时容量超过2，会淘汰使用频次较低的key2
        System.out.println(cache.getIfPresent("key3")); // val3
        System.out.println(cache.getIfPresent("key1")); // val1
        System.out.println(cache.getIfPresent("key2")); // null


        cache.invalidate("key1");
        System.out.println(cache.getIfPresent("key1")); // null
        System.out.println(cache.get("key1",key -> "val1")); // val1，get操作可同时传入一个Callable，数据若不存在会调用Callable计算并存入缓存

        cache.invalidateAll();
        System.out.println(cache.stats().hitRate()); // 0.5
        System.out.println(cache.stats().evictionCount()); // 1
        System.out.println(cache.estimatedSize()); // 0


        Logger logger = LoggerFactory.getLogger("ClassName");
        /**
         * 自动加载型cache
         */
        LoadingCache<String,Object> loadingCache = Caffeine.newBuilder()
                .maximumSize(50)
                .expireAfterWrite(1, TimeUnit.MINUTES)
                .recordStats()
                .removalListener((String key,Object obj, RemovalCause cause) -> {
                    logger.info("key:{},val:{},cause:{}",key,obj,cause);
                    System.out.printf("Key %s was removed (%s)%n", key, cause);
                })
                .build(key -> "default");

        // 由于key不存在 生成了值为NULL的缓存
        System.out.println(loadingCache.get("keyNotExist"));// default

        Map<String,Object> map = Maps.newHashMap();
        map.put("key1","val1");
        map.put("key2","val2");
        map.put("key3","val3");

        loadingCache.putAll(map);
        System.out.println(loadingCache.get("key1"));// val1

        Set<String> keySet = Sets.newHashSet("key5","key6","key7");
        loadingCache.getAll(keySet);
        System.out.println(loadingCache.get("key5"));// default

        ConcurrentMap<String,Object> map1 = loadingCache.asMap();
        for (Map.Entry entry : map1.entrySet()) {
            // key1:val1|key2:val2|key5:default|key6:default|key3:val3|key7:default|keyNotExist:default
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        map1.remove("key2");
        System.out.println(loadingCache.getIfPresent("key2")); // null 通过map操作也会影响loadingCache

        loadingCache.invalidate("key1");
        System.out.println(loadingCache.estimatedSize()); // 6
    }
}
