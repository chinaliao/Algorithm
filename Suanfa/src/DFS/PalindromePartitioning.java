package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:PalindromePartitioning
 * Description:
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(result,s,0,new ArrayList<>());
        return result;
    }
    private void backtrack(List<List<String>> r,String s,int start,List<String> sub){
        if (start==s.length()) {
            r.add(new ArrayList<>(sub));
            return;
        }
        for (int end =start+1 ; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            if (isPalindrome(substring)){
                sub.add(substring);
                backtrack(r, s, end, sub);
                sub.removeLast();
            }
        }
    }
    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }



}
