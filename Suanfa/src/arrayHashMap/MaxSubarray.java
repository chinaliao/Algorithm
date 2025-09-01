package arrayHashMap;

/**
 * ClassName:MaxSubarray
 * Description:Given an integer array nums, find a subarray that has the largest product,
 * and return the product.
 * The test cases are generated so that the answer will fit in a 32-bit integer.
 */
public class MaxSubarray {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        for (int i = 1;i< nums.length;i++) {
            int currentMax = max;
            int currentMin = min;
            max = Math.max(nums[i],Math.max(nums[i]*currentMax,nums[i]*currentMin));
            min = Math.min(nums[i],Math.min(nums[i]*currentMax,nums[i]*currentMin));

            ans = Math.max(ans,max);
        }
        return ans;
    }
}
