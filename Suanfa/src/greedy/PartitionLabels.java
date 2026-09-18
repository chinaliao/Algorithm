package greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:PartitionLables
 * Description:
 */
public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
            int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i)-'a'] = i;
        }
        List<Integer> res = new ArrayList<>();
        int end = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end,last[s.charAt(i)-'a']);

            if (i==end){
                res.add(i-start+1);
                start = i+1;
            }
        }
        return res;
    }
}

