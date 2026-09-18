package DFS;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:LetterCombinationOfAPhoneNumber
 * Description:Given a string containing digits from 2-9 inclusive,
 * return all possible letter combinations that the number could represent. Return the answer in any order.
 * A mapping of digits to letters (just like on the telephone buttons) is given below.
 * Note that 1 does not map to any letters.
 */
public class LetterCombinationOfAPhoneNumber {
    private static final String[] MAPPING ={
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits==null|| digits.isEmpty()) {
            return  result;
        }
        backtrack(result,digits,0,new StringBuilder());
        return result;

    }
    private void backtrack(List<String> result,String digits,int index,StringBuilder path) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }
        String s = MAPPING[digits.charAt(index) - '0'];
        for (int i = 0; i < s.length(); i++) {
            path.append(s.charAt(index));
            backtrack(result,digits,index+1,path);
            path.deleteCharAt(path.length()-1);
        }
    }
}
