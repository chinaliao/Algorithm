package greedy;

/**
 * ClassName:JumpGameII
 * Description:
 */
public class JumpGameII {
    public int jump(int[] nums) {

        if (nums==null|| nums.length==0){
            return 0;
        }
        int jumps = 0;
        int currentEnd = 0;
        int furthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            furthest = Math.max(furthest,i+nums[i]);
            if (i==currentEnd){
                jumps++;
                currentEnd = furthest;
                if (currentEnd>nums.length-1){
                    break;
                }
            }
        }
        return jumps;
    }
}
