package Beginner;

import java.util.Scanner;

/**
 * ClassName:ReverseNumberPlus
 * Description:
 */
public class ReverseNumberPlus {
    private static String trimLeadingZero(String s){
        int i = 0;
        while(i<s.length()-1&&s.charAt(i)=='0') i++;
        return s.substring(i); //截取非零部分 整数  6540 -> 0456 -> 456
    }
    private static String trimEndingZero(String s){
        int i = s.length()-1;
        while (i>0&&s.charAt(i)=='0') i--;
        return s.substring(0,i+1);//截取非零部分 小数  12.09 -> 21.90 -> 21.9   注意subString 的特性左包右不包
    }
    private static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //小数
        if (s.contains(".")){
            String[] split = s.split("\\.");
            String s1 = trimLeadingZero(reverse(split[0]));
            String s2 = trimEndingZero(reverse(split[1]));
            System.out.println(s1+"."+s2);
        }else if (s.contains("/")){ //分数
            String[] split = s.split("/");
            String s1 = trimLeadingZero(reverse(split[0]));
            String s2 = trimLeadingZero(reverse(split[1]));
            System.out.println(s1+"/"+s2);
        }else if (s.endsWith("%")) { // 百分数
            String num = s.substring(0, s.length() - 1);
            num = trimLeadingZero(reverse(num));
            System.out.println(num + "%");

        } else { // 整数
            String res = trimLeadingZero(reverse(s));
            System.out.println(res);
        }
    }
}
