package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static String[] uncommonFromSentences(String A, String B) {
        String[] a = A.split(" ");
        String[] b = B.split(" ");


        Map<String,Integer> map = new HashMap<>();
        for (String s  : a) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> resultList = new ArrayList<>();
        for (String s  : b) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

       for (Map.Entry<String,Integer> entry : map.entrySet()){
           if(entry.getValue() == 1){
               resultList.add(entry.getKey());
           }
       }

       return resultList.parallelStream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        String a = "apple apple";
        String b = "banana banana banana";
        String[] ret = uncommonFromSentences(a,b);
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
    }
}

