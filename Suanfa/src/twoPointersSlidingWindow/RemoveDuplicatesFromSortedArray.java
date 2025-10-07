package twoPointersSlidingWindow;

/**
 * ClassName:RemoveDuplicatesFromSortedArray
 * Description: 题目的关键在于数组是已经排好序的了
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;
        for (;fast< nums.length;fast++){
            if (nums[fast]!=nums[slow]){
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow+1;
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

        // 测试用例1: 包含重复元素的数组
        int[] nums1 = {1, 1, 2};
        int len1 = solution.removeDuplicates(nums1);
        System.out.println("测试用例1:");
        System.out.println("新长度: " + len1);
        System.out.print("数组内容: ");
        for (int i = 0; i < len1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        // 测试用例2: 多个重复元素
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = solution.removeDuplicates(nums2);
        System.out.println("测试用例2:");
        System.out.println("新长度: " + len2);
        System.out.print("数组内容: ");
        for (int i = 0; i < len2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        // 测试用例3: 空数组
        int[] nums3 = {};
        int len3 = solution.removeDuplicates(nums3);
        System.out.println("测试用例3:");
        System.out.println("新长度: " + len3);

        // 测试用例4: 单个元素
        int[] nums4 = {1};
        int len4 = solution.removeDuplicates(nums4);
        System.out.println("测试用例4:");
        System.out.println("新长度: " + len4);
        System.out.print("数组内容: ");
        for (int i = 0; i < len4; i++) {
            System.out.print(nums4[i] + " ");
        }
        System.out.println();
    }
}
