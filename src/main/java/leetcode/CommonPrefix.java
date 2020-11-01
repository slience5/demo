package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class CommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"ffaaa", "ff"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        // sort by strs.length()

        Arrays.sort(strs, (t1,t2) -> {
            int size1 = t1.length();
            int size2 = t2.length();
            if(size1 - size2 == 0){
                return 0;
            }
            return size1 - size2 > 0 ? 1 : -1;
        });

        String prefix = "";
        for(String str : strs){
            prefix = getCommonPrefix(prefix,str);
            if(prefix == ""){
                return "";
            }
        }
        return prefix;
    }

    private static String getCommonPrefix(String prefix,String str){
        if(prefix == ""){
            return str;
        }

        // 遍历找到共同前缀
        if(str.startsWith(prefix)){
            return prefix;
        }

        String tempPrefix = "";
        for(int i=0; i<prefix.length()-1; i++){
            if(str.charAt(i) == prefix.charAt(i)){
                tempPrefix += prefix.charAt(i);
                continue;
            }
            break;
        }
        return tempPrefix;
    }
}
