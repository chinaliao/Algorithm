package DP;

import java.util.Scanner;

/**
 * ClassName:ClimbStairs
 * Description:有 n 个台阶，你每次可以走 1 步或 2 步，问走到第 n 阶有几种走法。
 */
public class ClimbStairs {
    public static void main(String[] args) {
//dp[i]标识第i阶台阶有多少种走法
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
