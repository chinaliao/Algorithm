package JiTiao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName:num4
 * Description: List<Integer> cycles = new ArrayList<>();

 */
public class num4 {
    public static void main(String[] args) {
        int n;
        int m;
        int T;
        Scanner sc = new Scanner(System.in);

             n = sc.nextInt();
             m = sc.nextInt();
             T = sc.nextInt();

        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        List<Integer> cycles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
             for (int j = 0; j < m; j++) {
                 int grow = a[i][j];
                 for (int day = grow + 1; day <= T; day += (grow + 2)) {
                     cycles.add(day);
                 }
             }
         }
        Collections.sort(cycles);

        int count = 0;

        for (int c : cycles) {
            if ((count + 1) * 2 <= c + 1) { //第0天也算1天
                count++;
            }
        }
        System.out.println(count);

    }
}
