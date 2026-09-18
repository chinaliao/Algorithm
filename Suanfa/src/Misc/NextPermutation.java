package Misc;

/**
 * ClassName:NextPermutation
 * Description:
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
//        找第一个降序的地方，如果减到i<=0说明全部都是降序，已经是最大的数组排列
        while (i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if (i>=0){
            int j = nums.length-1;
            while (nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }

    private void reverse(int[] nums, int start, int i1) {
        while (start<i1){
            swap(nums,start,i1);
            start++;
            i1--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
