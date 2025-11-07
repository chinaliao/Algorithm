package StackQuene;

import java.util.Stack;

/**
 * ClassName:DecodeString
 * Description:<a href="https://leetcode.com/problems/decode-string">...</a>
 */
public class DecodeString {
    public String decodeString(String s) {
        StringBuilder currStr = new StringBuilder();
        int num = 0;
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)){
                num = num*10+(c-'0');
            } else if (c == '[') {
                numStack.push(num);
                stringStack.push(currStr.toString());
                num=0;
                currStr= new StringBuilder();
            } else if (c == ']') {
                int times = numStack.pop();
                StringBuilder stringBuilder = new StringBuilder(stringStack.pop());
                for (int i = 0; i < times; i++) {
                    stringBuilder.append(currStr);
                }
                currStr=stringBuilder;
            }else currStr.append(c);
        }
        return currStr.toString();
     }

    public static void main(String[] args) {
        System.out.println(new DecodeString().decodeString("3[a]2[bc]"));
    }
}
