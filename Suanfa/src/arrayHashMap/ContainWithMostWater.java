package arrayHashMap;

/**
 * ClassName:ContainWithMostWater
 * Description:
 * You are given an integer array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 */
public class ContainWithMostWater {
    public int maxArea(int[] height) {
        int left = 0,right = height.length-1;
        int maxArea = 0;
        while(right>left){
            int h = Math.min(height[left], height[right]);
            int w = right-left;
            maxArea = Math.max(maxArea,h*w);
            if (height[left]>height[right]){
                right--;
            } else if (height[right] > height[left]) {
                left++;
            }
        }
        return maxArea;
    }
}
