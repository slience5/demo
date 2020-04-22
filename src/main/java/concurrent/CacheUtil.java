package concurrent;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.souche.optimus.cache.CacheService;
import com.souche.optimus.common.util.StringUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.poi.ss.formula.functions.T;

import java.time.Duration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CacheUtil{
    /**
     * 缓存计算过程
     */
    private static final ConcurrentHashMap<String, Future> tasks = new ConcurrentHashMap<>();

    private static final ConcurrentHashMap<String, Integer> tags = new ConcurrentHashMap<>();

    /**
     * 本地缓存
     */
    private Cache<String,Object> cache = Caffeine.newBuilder()
            .expireAfterWrite(Duration.ofMinutes(1))
            .maximumSize(100)
            .build();

    /**
     * 分布式缓存
     */
    private CacheService cacheService;

    /**
     * 计算函数
     */
    private Compute<Param,T> c;


    public <T> T get(String key,Class<T> clazz){
        if(StringUtil.isEmpty(key)){
            return null;
        }
        T t = (T) cache.getIfPresent(key);
        if(t != null){
            System.out.println("命中本地缓存～～～～～～～～·");
            checkAndDeleteTask(key);
            return t;
        }

//        t = cacheService.getObject(key,clazz);
        if(t != null){
            System.out.println("命中分布式缓存～～～～～～～～·");
            cache.put(key,t);
            checkAndDeleteTask(key);
            return t;
        }

        return null;
    }

    private void checkAndDeleteTask(String key){
        Future<T> exist = (Future<T>) tasks.get(key);
        if(exist != null){
            tasks.remove(key);
            tags.remove(key);
        }

    }

    public <T> T set(String key,Param params, Compute<Param,T> c,int expireSeconds){
        T r = this.compute(key,params,c);

//        // 重复设值问题
//        Integer tag = tags.putIfAbsent(key,0);
//        if(tag == null){
            cache.put(key,r);
            System.out.println("本地缓存设值～～～～～～～～～～～～");

//            cacheService.setObject(key,r,expireSeconds);
            System.out.println("分布式缓存设值～～～～～～～～～～～～");
//        }
        return r;
    }

    public <T> T compute(final String key, final Param params, Compute<Param,T> c){
        while(true){
            Future<T> f = (Future<T>) tasks.get(key);
            if(f == null){
                CompletableFuture<T> f1 = CompletableFuture.completedFuture(c.compute(params));
                f = (Future<T>) tasks.putIfAbsent(key,f1);
                if(f == null){
                    f = f1;
//                    f1.run();

                    System.out.println("计算～～～～～～～～～～～～～");
                }
            }
            try {
                return f.get();
            } catch (ExecutionException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            } catch (CancellationException | InterruptedException e){
                e.printStackTrace();
                tasks.remove(key);
            }
        }
    }


    /**
     * 查询缓存的参数对象
     */
    @Getter
    @Setter
    @ToString
    static class Param {
        String param0;

        String param1;

        String param2;

        String param3;

        String param4;

        String param5;
    }

    @FunctionalInterface
    public interface Compute<T,R>{
        R compute(T t);
    }
}
