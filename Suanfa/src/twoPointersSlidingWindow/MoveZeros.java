package twoPointersSlidingWindow;

/**
 * ClassName:MoveZeros
 * Description:
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        for(int fast = 0;fast<nums.length;fast++)
            if(nums[fast]!=0){
                nums[slow++]=nums[fast];
            }
        while (slow< nums.length){
            nums[slow++] = 0;
        }
    }

}
