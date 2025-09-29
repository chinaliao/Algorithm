package luoguRandom;

import java.util.Scanner;

/**
 * ClassName:PrimeFactorization
 * Description:
 */
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2;i<=Math.sqrt(n);i++){
            if (n%i==0&&isPrime(i)){
                int res = n/i;
                System.out.println(Math.max(res,i));
                return;
            }
        }
    }
    static boolean isPrime(int n){
        for (int i = 2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
