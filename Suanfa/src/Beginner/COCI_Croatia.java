package Beginner;

import java.util.Scanner;

/**
 * ClassName:Beginner.COCI_Croatia
 * Description:
 */
public class COCI_Croatia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int  N = n/52;
       boolean flag = false;
        for (int i = 100; i >= 1; i--) {
            if (flag){
                break;
            }
            for (int j = n; j >0; j--) {
                if (7*i+21*j==N){
                    flag = true;
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}
