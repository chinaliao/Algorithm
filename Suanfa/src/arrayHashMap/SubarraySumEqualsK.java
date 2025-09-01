package arrayHashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:SubarraySumEqualsK
 * Description:Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 * A subarray is a contiguous non-empty sequence of elements within an array.
 */
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer,Integer> preSum = new HashMap<>();
        preSum.put(0,1);
        for (int num : nums) {
            sum+=num;
            if (preSum.containsKey(sum-k)){
                count+=preSum.get(sum-k);
            }
            preSum.put(sum,preSum.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {


    }
}
