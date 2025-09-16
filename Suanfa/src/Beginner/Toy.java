package Beginner;

import java.io.*;
import java.util.StringTokenizer;

public class Toy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] N = new int[n];
        String[] jobs = new String[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            N[i] = Integer.parseInt(st.nextToken());
            jobs[i] = st.nextToken();
        }

        int pos = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int towardDir = Integer.parseInt(st.nextToken());
            int steps = Integer.parseInt(st.nextToken());
            if (N[pos] != towardDir) {
                pos = (pos + steps) % n;
            } else {
                pos = (pos - steps % n + n) % n;
            }
        }
        System.out.println(jobs[pos]);
    }
}
