package Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * ClassName:MergeIntervals
 * Description:
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals == null||intervals.length<=1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> res = new ArrayList<>();
        for (int[] interval : intervals) {
            if (res.isEmpty()||interval[0]>res.getLast()[1]){
                res.add(interval);
            }
            else {
                res.getLast()[1] = Math.max(res.getLast()[1], interval[1]);
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}
