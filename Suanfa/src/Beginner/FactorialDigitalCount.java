package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

/**
 * ClassName:FactorialDigitalCount
 * Description:
 */
public class FactorialDigitalCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String[] parts = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int target = Integer.parseInt(parts[1]);
            BigInteger factorial = factorial(n);

            int count = 0;
            for (char c : factorial.toString().toCharArray()) {
                if (c - '0' == target) count++;
            }
            list.add(count);
        }
        list.forEach(System.out::println);
    }

    static BigInteger factorial(int n){
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
