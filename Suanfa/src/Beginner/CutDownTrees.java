package Beginner;

import java.util.Scanner;

/**
 * ClassName:CutDownTrees
 * Description:
 */
public class CutDownTrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] trees = new int[N];
        int maxHeight = 0;
        for (int i = 0; i < N; i++) {
            trees[i] = scanner.nextInt();
            if (trees[i]>maxHeight){
                maxHeight = trees[i];
            }
        }
        int low =  0;
        int high = maxHeight;
        int ans = 0;
        while (high>=low){
            int mid = (low+high)>>>1;
            if (check(mid,M,trees)){
                low = mid+1;
                ans = mid;
            }else high = mid-1;
        }
        System.out.println(ans);
    }
    private static boolean check(int height,int required,int[] trees){
        long total = 0;
        for (int tree : trees) {
            if (tree>height){
                total+= tree-height;
            }
        }
        return total>=required;
    }

}
