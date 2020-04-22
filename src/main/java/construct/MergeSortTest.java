package construct;

public class MergeSortTest {


    public static void main(String[] args) {
        int[] testAry = {2,3,4,9,6,3,7,1};
        mergeSort(testAry,0,testAry.length-1);
        for (int i = 0; i < testAry.length; i++) {
            System.out.println(testAry[i]);
        }
    }

    private static void mergeSort(int[] ary,int low,int high){
        if(low >= high){
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(ary,low,mid);
        mergeSort(ary,mid+1,high);
        merge(ary,low,mid,high);

    }


    private static void merge(int[] ary,int low,int mid,int high){
        int[] aryNew = new int[high - low + 1];
        int j = 0;
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(ary[left] < ary[right]){
                aryNew[j++] = ary[left++];
            }else if (ary[left] > ary[right]){
                aryNew[j++] = ary[right++];
            }else{
                aryNew[j++] = ary[left++];
                aryNew[j++] = ary[right++];
            }
        }
        while (left <= mid){
            aryNew[j++] = ary[left++];
        }
        while (right <= high){
            aryNew[j++] = ary[right++];
        }
        for (int i = 0; i < aryNew.length; i++) {
            ary[low+i] = aryNew[i];
        }
    }
}
