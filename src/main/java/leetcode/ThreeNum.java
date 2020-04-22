package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeNum {

    public static void main(String[] args) {
        int[] ary = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(ary);
        for (int i = 0; i < ary.length; i++) {
            System.out.println(ary[i]);
        }
        System.out.println(threeSum(ary));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int low;
        int high;
        for (int i = 0; i < nums.length - 1; i++) {
           low = i+1;
           high = nums.length - 1;
           while (low < high){
               if((nums[i] + nums[low] + nums[high]) == 0){
                   List<Integer> result = new ArrayList<>();
                   result.add(nums[i]);
                   result.add(nums[low]);
                   result.add(nums[high]);
                   Collections.sort(result);
                   set.add(result);
                   low++;
                   high--;
               }else if((nums[i] + nums[low] + nums[high]) > 0){
                    high--;
               }else {
                   low++;
               }

           }
        }
        return new ArrayList(set);
    }

    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        for (int i = 1;;i++) {
            if(nums[j] <= 0){
                j++;
            }
            if(nums[j] == i){
                j++;
                i++;
            }else{
                return i;
            }
        }
    }

}
