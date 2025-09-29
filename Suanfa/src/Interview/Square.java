package Interview;

import java.util.Scanner;

/**
 * ClassName:Square
 * Description:
 */
public class Square {
    public static void main(String[] args) {
        System.out.println("输入三角形的高");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =0;
        for (int i = 1;i<=n;i++,m = 0){
            for (int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            while(m<2*i-1){
                System.out.print("*");
                m++;
            }
            System.out.println();
        }
    }
}
