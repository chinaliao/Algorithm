package arrayHashMap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName:LongestSubstringWithoutRepeating
 * Description:
 * 使用左右指针 ,左指针标识窗口的起始位置,右指针表示窗口的结束位置
 */
public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        Set<Character> set = new HashSet<>();
        int left=0;
        int maxLength=0;
        for (int i = 0; i < string.length(); i++) {
            char charAt = string.charAt(i);
            while (set.contains(charAt)){
                set.remove(string.charAt(left));
                left++;
            }
            set.add(charAt);
            maxLength = Math.max(maxLength,i-left+1);
        }
        System.out.println(set);
        System.out.println(maxLength);
    }
}
