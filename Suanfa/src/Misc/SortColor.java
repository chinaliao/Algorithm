package Misc;

/**
 * ClassName:SortColor
 * Description:
 */
public class SortColor {
    public void sortColors(int[] nums) {
        int  low = 0;
        int curr = 0;
        int high = nums.length-1;
        while (curr<=high){
            if (nums[curr]==0) {
                swap(nums,low,curr);
                low++;
                curr++;
            } else if (nums[curr] == 2) {
                swap(nums,high,curr);
                high--;
            }else curr++;
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
