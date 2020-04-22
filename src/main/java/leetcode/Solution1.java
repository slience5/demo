package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
    public String[] uncommonFromSentences(String A, String B) {
        List<String> list = new ArrayList<>();

        String[] stringA = A.split(" ");
        String[] stringB = B.split(" ");

        Map<String, Integer> mapA = new HashMap<String, Integer>();
        Map<String, Integer> mapB = new HashMap<String, Integer>();

        for(String s : stringA) {
            mapA.put(s, mapA.getOrDefault(s, 0) + 1);
        }

        for(String s : stringB) {
            mapB.put(s, mapB.getOrDefault(s, 0) + 1);
        }

        for(String s : stringA) {
            if(mapA.getOrDefault(s, 0) == 1 && mapB.getOrDefault(s, 0) == 0)    {
                list.add(s);
            }
        }

        for(String s : stringB) {
            if(mapB.getOrDefault(s, 0) == 1 && mapA.getOrDefault(s, 0) == 0)    {
                list.add(s);
            }
        }

        int index = 0;
        String[] result = new String[list.size()];
        for(String s : list) {
            result[index++] = s;
        }

        return result;
    }
}
