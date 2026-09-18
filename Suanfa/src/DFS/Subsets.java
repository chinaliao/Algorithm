package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:Subsets
 * Description:
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null||nums.length==0) {
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums,0);
        return res;

    }
    private void backtrack(List<List<Integer>> r,List<Integer> sub,int[] nums,int index){
        if (index==nums.length) {
            r.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[index]);
        backtrack(r,sub,nums,index+1);
        sub.removeLast();
        backtrack(r,sub,nums,index+1);
    }
}
