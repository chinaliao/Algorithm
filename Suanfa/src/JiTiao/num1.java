package JiTiao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 如果是多组输入保留while，单组去掉即可
        while (sc.hasNext()) {
            int S = sc.nextInt(); // 总容量
            int N = sc.nextInt(); // 瓶1容量
            int M = sc.nextInt(); // 瓶2容量
            System.out.println(bfs(S, N, M));
        }
    }

    static String bfs(int S, int N, int M) {
        if (S % 2 != 0) return "NO"; // 奇数必不可分
        int target = S / 2;

        // 队列存 int[]{当前N杯水量, 当前M杯水量, 步数}
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[105][105];

        q.offer(new int[]{0, 0, 0}); // 初始状态：N, M 都是空
        vis[0][0] = true;

        int[] caps = {S, N, M}; // 三个瓶子的容量上限

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int n = cur[0], m = cur[1], step = cur[2];
            int s = S - n - m; // 算出S瓶当前水量

            // 检查是否有两个瓶子水量等于 target
            if ((s == target && n == target) || (s == target && m == target) || (n == target && m == target)) {
                return String.valueOf(step);
            }

            // 当前三个瓶子的水量数组，方便遍历
            int[] now = {s, n, m};

            // 尝试 6 种倒水操作：从 i 倒给 j
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j) continue; // 自己不能倒给自己

                    int give = now[i];              // i 能给多少
                    int recv = caps[j] - now[j];    // j 能装多少

                    if (give > 0 && recv > 0) {
                        int move = Math.min(give, recv); // 实际倒水量

                        // 构造下一步状态
                        int[] next = now.clone();
                        next[i] -= move;
                        next[j] += move;

                        // 判重 (next[1]是N杯, next[2]是M杯)
                        if (!vis[next[1]][next[2]]) {
                            vis[next[1]][next[2]] = true;
                            q.offer(new int[]{next[1], next[2], step + 1});
                        }
                    }
                }
            }
        }
        return "NO";
    }
}