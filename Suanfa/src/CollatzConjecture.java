import java.util.Scanner;

/**
 * ClassName:CollatzConjecture
 * Description:
 * 给出一个正整数 n，然后对这个数字一直进行下面的操作：如果这个数字是奇数，那么将其乘 3 再加 1，否则除以 2。经过若干次循环后，最终都会回到 1。
 * 经过验证很大的数字（7×10^11）都可以按照这样的方式比变成 1，所以被称为“冰雹猜想”。例如当 n 是 20，变化的过程是 20→10→5→16→8→4→2→1。
 */
public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] nums = new long[100000];
        int i = 0;
        while (n != 1){
            nums[i] = n;
            i++;
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        nums[i] = 1;
       for (int j = 0,l =i;j< i/2+1;j++,l--){
           long temp = nums[j];
           nums[j] = nums[l];
           nums[l] = temp;
       }
       for (int j = 0;j<=i;j++){
           System.out.print(nums[j]);
           if (j != i){
               System.out.print(" ");
           }
       }
    }
}
