package DP;

import java.util.Arrays;

/**
 * ClassName:PerfectSquares
 * Description:
 */
public class PerfectSquares {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j*j < i; j++) {
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
