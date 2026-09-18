package DP;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:PascalsTriangle
 * Description:
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int i1 = 0; i1 <= i; i1++) {
                if (i1==0||i1==i){
                    row.add(1);
                }
                else {
                    int sum = dp.get(i - 1).get(i1 - 1) + dp.get(i - 1).get(i1);
                    row.add(sum);
                }
            }
            dp.add(row);
        }
        return dp;
    }
}
