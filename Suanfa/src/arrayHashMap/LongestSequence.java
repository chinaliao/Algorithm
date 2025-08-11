package arrayHashMap;

import java.util.Arrays;
import java.util.HashSet;

/**
 * ClassName:LongestSequence
 * Description:Given an unsorted array of integers nums,
 * return the length of the longest consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.
 */
public class LongestSequence {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxlength = 0;
        for (int i : set) {
            if (!set.contains(i-1)){
                int currentNum = i;
                int currentLength = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // 更新最长序列长度
                maxlength = Math.max(maxlength, currentLength);
            }
        }
        return maxlength;
    }

}
