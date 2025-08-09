package Beginner;

import java.util.Scanner;

/**
 * ClassName:Beginner.BookShelf
 * Description:
 */
public class BookShelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        int[] Height = new int[N];
        for (int i = 0; i < N; i++) {
            Height[i] = sc.nextInt();
        }
//        冒泡排序
        for (int i = 0; i < Height.length-1; i++){
            for (int j = 0; j < Height.length-1-i; j++) {
                if (Height[j] < Height[j+1]) {
                    int temp = Height[j];
                    Height[j] = Height[j+1];
                    Height[j+1] = temp;
                }
            }
        }
        int count = 0;
        int sumHeight = 0;
        for (int i : Height) {
            if (sumHeight >= B) {
                break;
            }
            sumHeight += i;
            count++;
        }
        System.out.println(count);
    }
}
