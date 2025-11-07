package twoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:FindAllAnagramsInString
 * Description:
 */
public class FindAllAnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] need = new int[26];
        int[] window = new int[26];
        for (char c : p.toCharArray()) {
            need[c-'a']++;
        }
        int left = 0;
        int right = 0;
        int valid = 0;
        while(right<s.length()){
            int r = s.charAt(right)-'a';
            window[r]++;
            if (window[r]<=need[r]) valid++;//++之后再判断,所以需要小于等于
            right++;
            while (right-left>p.length()){
                int l = s.charAt(left)-'a';
                if (window[l]<=need[l]) valid--;//先判断再--,所以需要小于等于
                window[l]--;
                left++;
            }
            if(valid==p.length()){
                res.add(left);
            }
        }
        return res;
    }
}
