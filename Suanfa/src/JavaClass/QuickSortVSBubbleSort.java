package JavaClass;

import java.util.Arrays;

/**
 * ClassName:QuickSortVSBubbleSort
 * Description:
 */
public class QuickSortVSBubbleSort {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void BubbleSort(int[] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = i;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static class QuickSortRecursive {
        public static void quickSort(int[] arr, int left, int right) {
            if (left >= right) return;

            // --- partition ---
            int pivot = arr[right];
            int slow = left - 1;
            for (int fast = left; fast < right; fast++) {
                if (arr[fast] <= pivot) {
                    slow++;
                    swap(arr, slow, fast);
                }
            }
            int tmp = arr[slow + 1]; arr[slow + 1] = arr[right]; arr[right] = tmp;
            int pivotIndex = slow + 1;



            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }

        public static void main(String[] args) {
         int[] arr = new int[100000];
         for (int i = 0; i < arr.length; i++){
             arr[i] = (int) (Math.random()*100000);
         }
            int[] arr2 = Arrays.copyOf(arr, arr.length);
            long begin = System.currentTimeMillis();
         quickSort(arr,0, arr.length-1);
            long end = System.currentTimeMillis();
            System.out.println(end-begin);
            begin = System.currentTimeMillis();
            BubbleSort(arr2);
            end = System.currentTimeMillis();
            System.out.println(end-begin);
        }
    }


}
