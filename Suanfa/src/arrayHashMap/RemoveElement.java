package arrayHashMap;

/**
 * ClassName:RemoveElement
 * Description:
 */
public class RemoveElement {
    public static int  removeElement(int[] nums , int val){
        int right = nums.length-1;
        for (int i = 0;i <= right;i++){
            if (nums[i] == val){
                swap(nums, i--, right--);
            }
        }
        return right+1;
    }
    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int i = removeElement(nums, val);
    }
}
