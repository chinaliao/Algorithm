package DP;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName:Coin
 * Description:给定硬币面额 {1, 3, 5}{1，3，5}，求凑成 nn 元的最少硬币数量。
 * 最终硬音面脸部{1，3，5}，找到原始的最小硬音量。
 */
public class Coin {
public Integer coinChange(int amount ,int[] coins){

    int dp[] = new int[amount+1];
    Arrays.fill(dp,amount+1);
    dp[0] = 0;
    for (int i = 1; i <= amount; i++) {
        for (int coin : coins) {
            if(i-coin>=0){
                dp[i] = Math.min(dp[i],dp[i-coin]+1);
            }
        }
    }
    return dp[amount]==amount+1?-1:dp[amount];
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int coinType = sc.nextInt();
        int[] coins = new int[coinType];
        for (int i = 0; i < coinType; i++) {
            coins[i] = sc.nextInt();
        }
        Coin coin = new Coin();
        Integer i = coin.coinChange(amount, coins);
        System.out.println(i);
    }
}
