package DP;

/**
 * ClassName:HouseRobber
 * Description:
 */
public class HouseRobber {
    public int rob(int[] nums) {
        if (nums == null|| nums.length==0) {
            return 0;
        }
        int currMax = 0;
        int preMax = 0;
        for (int num : nums) {
            int temp = currMax;
            currMax = Math.max(currMax,preMax+num);
            preMax = temp;
        }
        return currMax;
    }
}
