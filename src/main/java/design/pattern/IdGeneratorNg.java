package design.pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class IdGeneratorNg {
    private static final Logger logger = LoggerFactory.getLogger(IdGeneratorNg.class);


    private static final int ASCII_LENGTH = 122;

    private static final int RANDOM_CHAR_LENGTH = 8;

//    private static String hostName;
//
//    static {
//        try {
//            hostName = InetAddress.getLocalHost().getHostName();
//            String[] tokens = hostName.split("\\.");
//            if (tokens.length > 0) {
//                hostName = tokens[tokens.length - 1];
//            }
//        } catch (UnknownHostException e) {
//            logger.warn("failed to get the host name",e);
//        }
//    }

    public static String generate() {
        return String.format("%s-%d-%s", getLastFieldOfHostName(),
                System.currentTimeMillis(), getRandomChar(RANDOM_CHAR_LENGTH));
    }

    private static String getLastFieldOfHostName(){
        String hostName = null;
        try {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String[] tokens = hostName.split("\\.");

        String lastField = tokens.length > 0 ? hostName = tokens[tokens.length - 1] : hostName;

        return lastField;
    }

    private static String getRandomChar(int length){
        Random random = new Random();
        char[] randomChars = new char[length];

        int count = 0;
        while (count < length){
            int randomAscii = random.nextInt(ASCII_LENGTH);
            if (isNum(randomAscii)) {
                randomChars[count] = (char)('0' + (randomAscii - 48));
            } else if (isUpperCase(randomAscii)) {
                randomChars[count] = (char)('A' + (randomAscii - 65));
            } else if (isLowerCase(randomAscii)) {
                randomChars[count] = (char)('a' + (randomAscii - 97));
            }
        }

        return String.valueOf(randomChars);
    }

    private static boolean isNum(int asciiCode){
        return asciiCode >= 48 && asciiCode <= 57;
    }

    private static boolean isUpperCase(int asciiCode){
        return asciiCode >= 65 && asciiCode <= 90;
    }

    private static boolean isLowerCase(int asciiCode){
        return asciiCode >= 97 && asciiCode <= 122;
    }
}
