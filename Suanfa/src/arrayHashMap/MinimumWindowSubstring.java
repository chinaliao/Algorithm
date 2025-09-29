package arrayHashMap;

/**
 * ClassName:MinimumWindowSubstring
 * Description:
 * Given two strings s and t of lengths m and n respectively,
 * return the minimum window substring of s such that every
 * character in t (including duplicates) is included in the window.
 * If there is no such substring, return the empty string "".
 */
public class MinimumWindowSubstring {
    public static void main(String[] args) {

    }
    public String minWindow(String s, String t) {
        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;//把t中对应的字符出现的次数加起来
        }
        int left = 0;
        int right = 0;
        int valid=0;int start = 0,minLen = Integer.MAX_VALUE;
        int[] window = new int[128];
        while (right<s.length()){
            char c = s.charAt(right);
            right++;
            if (need[c]>0){//这个c字符在t里面
                window[c]++;//存到窗口里面
                if (window[c]<=need[c]){
                    valid++;//表示从s里取出来的符合t的字母的个数
                }
            }
            while (valid==t.length()){ //的到的符合的字符个数已经满足了t的长度
                if (right-left<minLen){
                    minLen = right-left;
                    start = left;//更新起点
                }
                char b = s.charAt(left);
                left++;
                if (need[b]>0){
                    if (window[b]<=need[b]){
                        valid--;
                    }
                    window[b]--;
                }
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}
