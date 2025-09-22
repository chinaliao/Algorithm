package Beginner;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * ClassName:SumOfFactorial
 * Description:
 */
public class SumOfFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 1; i <=n ; i++) {
             sum = sum.add(factorial(i));
        }
        System.out.println(sum);
    }
    static BigInteger factorial(int n){
        if (n==1){
            return BigInteger.valueOf(1);
        }
        else return BigInteger.valueOf(n).multiply(factorial(n-1));
    }
}
