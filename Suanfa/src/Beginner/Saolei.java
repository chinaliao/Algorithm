package Beginner;

import java.util.Scanner;

/**
 * ClassName:Beginner.Saolei
 * Description:
 */
public class Saolei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();


                char[][] map = new char[n][m];

                // 读取雷区地图
                for (int i = 0; i < n; i++) {
                    String line = sc.nextLine();
                    map[i] = line.toCharArray();
                }

                // 定义8个方向
                int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
                int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

                // 构造输出
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (map[i][j] == '*') {
                            System.out.print('*');
                        } else {
                            int count = 0;
                            for (int k = 0; k < 8; k++) {
                                int ni = i + dx[k];
                                int nj = j + dy[k];
                                if (ni >= 0 && ni < n && nj >= 0 && nj < m && map[ni][nj] == '*') {//判断边界
                                    count++;
                                }
                            }
                            System.out.print(count);
                        }
                    }
                    System.out.println();
                }
            }
        }