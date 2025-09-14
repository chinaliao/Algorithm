package JavaClass;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;


/**
 * ClassName:test
 * Description:
 */
public class testReverse {
    @Test
    public void test01(){

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String originalNumber = String.valueOf(number);
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));
        String string = stringBuffer.reverse().toString();
        if (originalNumber.equals(string)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
//        int n = number;
//        int temp = number;
//        int count = 0;
//        while (temp > 0) {
//            temp /= 10;
//            count++;
//        }
//
//        int[] digits = new int[count];
//        int[] digits1 = new int[count];
//        for (int i = count - 1; i >= 0; i--) {
//            digits[i] = number % 10;
//            number /= 10;
//        }for (int i = count - 1; i >= 0; i--) {
//            digits1[i] = n % 10;
//            n /= 10;
//        }
//        if (Arrays.equals(digits,digits1)){
//            System.out.println("true");
//        }
    }

}
