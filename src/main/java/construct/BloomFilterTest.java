package construct;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.nio.charset.Charset;
import java.util.Random;

public class BloomFilterTest {

    public static void main(String[] args) {
        BloomFilter<String> bloomFilter = BloomFilter.create(Funnels.stringFunnel(Charset.forName("UTF-8")),100000);
        for (int i = 195000; i < 200000; i++) {
            bloomFilter.put(String.valueOf(i));
        }
        for (int i = 0; i < 10; i++) {
            Integer num  = new Random().nextInt(100000);
            System.out.println(bloomFilter.mightContain(String.valueOf(num)));
        }
        System.out.println(bloomFilter.approximateElementCount());

    }
}

