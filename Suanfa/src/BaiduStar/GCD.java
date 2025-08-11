package BaiduStar;

/**
 * ClassName:GCD
 * Description:
 */
public class GCD {

    /**
     * 特殊排列问题
     * 给定正整数n，找到使得gcd(1^p1, 2^p2, ..., n^pn)尽可能大的字典序最小排列p
     */


        /**
         * 找到最优排列
         * @param n 正整数n
         * @return 最优排列
         */
        public int[] findPermutation(int n) {

            int[] permutation = new int[n];

            // 简单的贪心策略：为了字典序最小，按自然顺序排列
            // 但由于1^x = 1，所以1的位置很关键
            if (n == 1) {
                permutation[0] = 1;
                return permutation;
            }

            // 将2到n按顺序排列，1放在最后
            for (int i = 0; i < n - 1; i++) {
                permutation[i] = i + 2;
            }
            permutation[n - 1] = 1;

            return permutation;
        }


        public long computeGcd(int[] perm) {
            if (perm.length == 1) {
                return 1; // 1^p1 = 1
            }

            long result = power(1, perm[0]);
            for (int i = 1; i < perm.length; i++) {
                result = gcd(result, power(i + 1, perm[i]));
            }
            return result;
        }

        /**
         * 计算a的b次幂
         */
        private long power(int a, int b) {
            long result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        }

        /**
         * 计算两个数的最大公约数
         */
        private long gcd(long a, long b) {
            while (b > 0) {
                long temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static void main(String[] args) {
            GCD sp = new GCD();
            int n = 3;
            int[] result = sp.findPermutation(n);

            System.out.print("排列: ");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();

            System.out.println("GCD: " + sp.computeGcd(result));
        }
    }


