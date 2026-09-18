package DFS;

import DP.Lis;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:GenerateParentheses
 * Description:
 */
public class GenerateParentheses {
    public List<String> generateParentheses(int n){
        List<String> result = new ArrayList<>();
        backtrack(result,new StringBuilder(),0,0,n);
        return result;
    }
    private static void backtrack(List<String> result,StringBuilder current,int open ,int close,int max){
       if (current.length()==max*2){
           result.add(current.toString());
           return;
       }
        if (open<max) {
            current.append("(");
            backtrack(result,current,open+1,close,max);
            current.deleteCharAt(current.length()-1);
        }
        if (open<close){
            current.append(")");
            backtrack(result,current,open,close+1,max);
            current.deleteCharAt(current.length()-1);
        }
    }
}
