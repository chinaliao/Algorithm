package greedy;

import java.util.Arrays;

/**
 * ClassName:JumpGame
 * Description:
 */
public class JumpGame {
    //dp
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean []dp =new boolean[n];
        dp[n-1] = true;

        for (int i = n-2; i >= 0; i--) {
            int maxJump = Math.min(n-1,i+nums[i]);

            for (int j = i+1; j < maxJump; j++) {
                if (dp[j]){
                    dp[i] = true;
                    break;
                }
            }
        }
return dp[0];

    }
//    greedy
    public boolean canJump2(int[] nums) {
      int furthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i>furthest) {
                return false;
            }
            furthest = Math.max(furthest,i+nums[i]);

            if (furthest>=nums.length-1){
                return true;
            }
        }
        return true;
    }
}
