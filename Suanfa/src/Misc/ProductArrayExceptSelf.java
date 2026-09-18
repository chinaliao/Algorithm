package Misc;

/**
 * ClassName:ProductArrayExceptSelf
 * Description:
 */
public class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i-1]*nums[i-1];
        }
        int right = 1;
        for (int length = nums.length-1; length >= 0; length--) {
            answer[length] = answer[length]*right;
            right*=nums[length];
        }
        return answer;
    }
}
