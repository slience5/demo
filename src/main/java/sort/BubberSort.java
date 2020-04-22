package sort;

import com.google.common.collect.Maps;
import com.souche.optimus.common.util.HashUtil;

import java.util.Map;
import java.util.UUID;

/**
 * 复杂度 o(n2)
 * @author jinlei
 *
 */
public class BubberSort {

    public static void main(String[] args) throws InterruptedException {
//        int[] nums = { 3, 1, 3, 5, 0 };
//        bubberSort(nums);
//        for (int i : nums) {
//            System.out.println(i);
//        }
        Map<String, Integer> map = Maps.newHashMap();
        int count = 0;
        int i = 0;
       while(i++ < 300) {
            UUID uuid = UUID.randomUUID();
            String uuids = HashUtil.convertToHashStr(uuid.getMostSignificantBits(), 5)
                                    + HashUtil.convertToHashStr(uuid.getMostSignificantBits(), 5);
           if(map.get(uuids) != null) {
               System.out.println(count + ":" + uuids);
           }else {
               map.put(uuids, 1);
           }
           count ++ ;
           if(299 == i) {
               Thread.sleep(1000);
               System.out.println("sleep = " + i);
               i=0;
           }
        }
       
       
    }


    public static void bubberSort(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j + 1] < nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
