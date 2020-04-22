package leetcode;

import java.util.Arrays;

public class SubarraySumEqualsK {

    public static void main(String[] args) {

    }


    public int subarraySum(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;

        int aryNum = 0;
        while (aryNum < nums.length) {
            for (int num : nums) {
                if (num == k) {
                    count++;
                }
            }

        }

        return 0;
    }

}
