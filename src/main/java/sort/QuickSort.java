package sort;

/**
 * 复杂度 o(nlogn)
 * @author jinlei
 *
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 1, 0 };
        quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }


    public static void quickSort(int[] nums, int head, int tail) {
        if (head >= tail || nums == null || nums.length <= 1) {
            return;
        }

        int i = head;
        int j = tail;
        int privotNum = (head + tail) / 2;
        int privot = nums[privotNum];
        while (i < j) {
            while (nums[i] < privot) {
                i++;
            }
            while (nums[j] > privot) {
                j--;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        if (i == j) {
            i++;
        }
        quickSort(nums, head, j);
        quickSort(nums, i, tail);
    }
}
