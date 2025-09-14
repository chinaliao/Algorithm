package arrayHashMap;

import java.util.Scanner;

/**
 * ClassName:Search
 * Description:
 */
public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int [] targets = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++){
            targets[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {

            System.out.print( binarySearchFirst(a, targets[i])+ " ");
        }
    }
    public static int binarySearchFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                result = middle + 1; // 转换为1-based索引
                right = middle - 1;  // 继续在左半部分查找第一次出现位置
            }
        }
        return result;
    }
}
