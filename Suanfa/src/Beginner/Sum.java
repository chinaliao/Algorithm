package Beginner;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName:Sum
 * Description:区间求和
 */
public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] pre = new long[n+1];
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i-1]+scanner.nextInt();
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int begin = scanner.nextInt();
            int end = scanner.nextInt();
            long sum = pre[end]-pre[begin-1];
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }

    @Test
    public void test(){
        //其实这个理论上是可以的,但是运用封装好的方法往往会性能差
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int begin = sc.nextInt();
            int end = sc.nextInt();
            int sum = list.subList(begin-1, end).stream().mapToInt(Integer::intValue).sum();
            sb.append(sum).append("\n"); // 每个结果换行
        }

        System.out.println(sb);
    }
}
