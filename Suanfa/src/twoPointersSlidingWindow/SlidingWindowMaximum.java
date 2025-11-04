package twoPointersSlidingWindow;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName:SlidingWindowMaximum
 * Description:
 */
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||k==0) return  new int[0];
        Deque<Integer> deque = new ArrayDeque<>();
        int n = nums.length;
        int []res = new int[n-k+1];
        int index=0;
        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty()&&deque.peekFirst()<=i-k) deque.pollFirst();
            while (!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]) deque.pollLast();
            deque.offerLast(i);
            if(i>=k-1){
                res[index++]=nums[deque.peekFirst()];
            }
        }
        return res;
    }
}
