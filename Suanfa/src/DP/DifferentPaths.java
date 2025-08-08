package DP;

import java.util.Scanner;

/**
 * ClassName:DifferentPaths
 * Description:机器人从左上角 (0,0) 走到右下角 (m-1, n-1)，每次只能向下或向右走，问有多少种走法。
 */
public class DifferentPaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(); // 行数
        int n = scanner.nextInt(); // 列数
        
        // dp[i][j] 表示从(0,0)到(i,j)的路径数
        int[][] dp = new int[m][n];
        
        // 初始化第一行和第一列  确保边界条件
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        
        // 填充dp表
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        System.out.println(dp[m-1][n-1]);
    }
}
