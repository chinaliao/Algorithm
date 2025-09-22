package Beginner;


import java.util.Scanner;

/**
 * ClassName:PrimePalindromes
 * Description:
 */
public class PrimePalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // 遍历范围内的所有数字
        for (int num = a; num <= b; num++) {
            if (num % 2 == 0 && num != 2) continue; // 偶数直接跳过
            if (isPalindrome(num) && isPrime(num)) {//先判断回文数性能更高因为回文数数量一定小于质数
                System.out.println(num);
            }
        }
    }

        // 判断一个数是否为质数的方法
    public static boolean isPrime(int n) {
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int m){
        if (m%10==0&&m!=0){
            return false;
        }
        int n = 0;
        while (m>n){
            n = n*10+m%10;
            m/=10;
        }
        return n==m||m==n/10;
    }
}
