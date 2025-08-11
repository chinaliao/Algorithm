package Beginner;
/**
 * ClassName:CalculateSquares
 * Description:有一个 n×m 方格的棋盘，求其方格包含多少正方形、长方形（不包含正方形）。
 */
public class CalculateSquares {

    /**
     * 计算正方形个数
     * @param n 棋盘行数
     * @param m 棋盘列数
     * @return 正方形个数
     */
    public long countSquares(int n, int m) {
        long count = 0;
        int min = Math.min(n, m);
        for (int k = 1; k <= min; k++) {
            count += (long)(n - k + 1) * (m - k + 1);
        }
        return count;
    }

    /**
     * 计算长方形个数（不包含正方形）
     * @param n 棋盘行数
     * @param m 棋盘列数
     * @return 长方形个数
     */
    public long countRectangles(int n, int m) {
        // 所有矩形个数
        long totalRectangles = ((long)n * (n + 1) / 2) * ((long)m * (m + 1) / 2);
        // 长方形个数 = 所有矩形个数 - 正方形个数
        return totalRectangles - countSquares(n, m);
    }

    /**
     * 输出结果
     * @param n 棋盘行数
     * @param m 棋盘列数
     */
    public void calculate(int n, int m) {
        long squares = countSquares(n, m);
        long rectangles = countRectangles(n, m);
//        System.out.println("正方形个数: " + squares);
//        System.out.println("长方形个数: " + rectangles);
        System.out.print(squares+" "+rectangles);
    }

    public static void main(String[] args) {
        CalculateSquares solution = new CalculateSquares();
        // 示例：2×3的棋盘
        solution.calculate(2, 3);
    }
}

