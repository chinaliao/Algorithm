package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:CombinationSum
 * Description:Given an array of distinct integers candidates and a target integer target,
 * return a list of all unique combinations of candidates where the chosen numbers sum to target.
 * You may return the combinations in any order.
 * The same number may be chosen from candidates an unlimited number of times.
 * Two combinations are unique if the frequency of at least one of the chosen numbers is different.
 * The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        int remain = target;
        backtrack(result,candidates,target,new ArrayList<>(),0);
        return result;
    }
    private void backtrack(List<List<Integer>> r,int[] c,int remain,List<Integer> path,int start) {
        if (remain==0) {
            r.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < c.length; i++) {
            if (c[i]>remain){
                return;
            }
            path.add(c[i]);
            backtrack(r,c,remain-c[i],path,i);
            path.removeLast();
        }
    }
}
