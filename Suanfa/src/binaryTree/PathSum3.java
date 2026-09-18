package binaryTree;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:PathSum3
 * Description:
 */
public class PathSum3 {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Integer,Integer> map = new HashMap<>();

        int currSum = 0;
        map.put(0,1);

        return dfs(root,currSum,targetSum,map);
    }

    private int dfs(TreeNode root, int currSum, int targetSum, Map<Integer, Integer> map) {
        if (root == null) {
            return 0;
        }
        currSum+=root.val;

        Integer res = map.getOrDefault(currSum - targetSum, 0);
        map.put(currSum,map.getOrDefault(currSum,0)+1);
        res+=dfs(root.left,currSum,targetSum,map);
        res+=dfs(root.right,currSum,targetSum,map);
        map.put(currSum,map.get(currSum)-1);

        return res;
    }
}
