package concurrent;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import javax.crypto.KeyGenerator;
import java.nio.charset.Charset;
import java.util.Random;

public class HashTest {

    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        HashFunction murmurHash32 = Hashing.goodFastHash(32);
        for (int i = 0; i < 10000000; i++) {
            murmurHash32.hashString(getRandomString(10),Charset.forName("UTF-8"));
        }
        long end = System.currentTimeMillis();
        System.out.println("MurMur花费时间 = " + Long.valueOf(end - start));


        long Mur128start = System.currentTimeMillis();
        HashFunction murmurHash128 = Hashing.goodFastHash(128);
        for (int i = 0; i < 10000000; i++) {
            murmurHash128.hashString(getRandomString(10),Charset.forName("UTF-8"));
        }
        long Mur128End = System.currentTimeMillis();
        System.out.println("MurMur123花费时间 = " + Long.valueOf(Mur128End - Mur128start));


        HashFunction Md5 = Hashing.hmacMd5(KeyGenerator.getInstance("HmacMD5").generateKey());
        long Md5Start= System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            Md5.hashString(getRandomString(10),Charset.forName("UTF-8"));
        }
        long Md5end = System.currentTimeMillis();
        System.out.println("MD5花费时间 = " + Long.valueOf(Md5end - Md5Start));
    }

    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
