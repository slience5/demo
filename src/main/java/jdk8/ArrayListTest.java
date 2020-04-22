package jdk8;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import java.util.List;

public class ArrayListTest {

    
    public static void main(String[] args) {
        String[] names = {"jinlei","ceshi","yanfa"};
        
        List<String> list = Lists.asList("", names);
        
        List<String> list2 = Lists.asList("sss", names);
        
        System.out.println(JSON.toJSON(list));
        
        System.out.println(JSON.toJSON(list2));
        
    }
   
}
