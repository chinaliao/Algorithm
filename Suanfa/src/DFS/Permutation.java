package DFS;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Permutation
 * Description:
 */
public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        backtrack(r,nums,new ArrayList<>(),new boolean[nums.length]);
        return r;
    }

    private void backtrack(List<List<Integer>> result,int[] nums,List<Integer> path,boolean[] used){
        if (path.size()== nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]){
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            backtrack(result,nums,path,used);

            used[i]=false;
            path.removeLast();
        }
    }
}
