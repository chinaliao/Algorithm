package Misc;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:SingleNumber
 * Description:Given a non-empty array of integers nums, every element appears twice except for one.
 * Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1) {
                return entry.getKey();
            }
        }return -1;
    }
}
