package DP;

import java.util.Arrays;

/**
 * ClassName:Lis
 * Description:给定数组 [10, 9, 2, 5, 3, 7, 101, 18]，求最长严格递增子序列的长度。
 */
public class Lis {
        public int lengthOfLIS(int[] nums){
            if (nums == null||nums.length==0) {
                return 0;
            }
            int[] dp = new int[nums.length];
            int maxLen = 1;
            Arrays.fill(dp,1);
        for (int i = 1;i<nums.length;i++){
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]){
                    dp[i]= Math.max(dp[i],dp[j]+1 );
                }
            }
            maxLen = Math.max(maxLen,dp[i]);
        }
        return maxLen;
        }

    public static void main(String[] args) {
        int[] nums = new int[]{10,9, 2, 5, 3, 7, 101, 18};
        Lis lis = new Lis();
        int length = lis.lengthOfLIS(nums);
        System.out.println("maxlength = " + length);

    }
}
