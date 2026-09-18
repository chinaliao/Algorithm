package StackQuene;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:TopKFrequentElements
 * Description:
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for (Integer num : map.keySet()) {
            Integer freq = map.get(num);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }
        int[] res = new int[k];int idx = 0;
        for (int i = bucket.length-1;i>=0&&idx<k;i--){
            if (bucket[i]!=null){
                for (Integer num : bucket[i]) {
                    res[idx++] = num;
                    if (idx==k) {
                        break;
                    }
                }
            }
        }
        return res;
    }
}
