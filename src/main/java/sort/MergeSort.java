package sort;

/**
 * 复杂度 o(nlogn)
 * @author jinlei
 *
 */
public class MergeSort {



    public static void main(String[] args) {
        int[] nums = { 9, 1, 3, 5, 0, 3, 4, 5, 3, 9, 0, 8, 6 };
        mergeSort(nums, 0, nums.length - 1);
        for (int i : nums) {
            System.out.println(i);
        }
    }


    public static void mergeSort(int[] nums, int low, int high) {
        int mid = (low + high) / 2;

        if (low < high) {
            mergeSort(nums, low, mid);

            mergeSort(nums, mid + 1, high);

            merge(nums, low, high, mid);
        }
    }


    public static void merge(int[] nums, int low, int high, int mid) {
        int[] result = new int[high - low + 1];

        int tLow = low;
        int tMid = mid + 1;
        int count = 0;
        while (tLow <= mid && tMid <= high) {
            if (nums[tLow] < nums[tMid]) {
                result[count] = nums[tLow];
                count++;
                tLow++;
            } else if (nums[tLow] == nums[tMid]) {
                result[count++] = nums[tLow];
                result[count++] = nums[tMid];
                tLow++;
                tMid++;
            } else {
                result[count] = nums[tMid];
                count++;
                tMid++;
            }
        }
        while (tLow <= mid) {
            result[count++] = nums[tLow++];
        }

        while (tMid <= high) {
            result[count++] = nums[tMid++];
        }

        for (int i = 0; i < result.length; i++) {
            nums[low + i] = result[i];
        }
    }

}
