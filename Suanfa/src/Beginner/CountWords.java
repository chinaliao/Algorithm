package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String targetWord = bufferedReader.readLine().trim();
        String text = bufferedReader.readLine();

        String lowerText = text.toLowerCase();
        String lowerTarget = targetWord.toLowerCase();

        int count = 0;
        int firstPosition = -1;
        int index = 0;

        while (true) {
            index = lowerText.indexOf(lowerTarget, index);
            if (index == -1) break;

            // 保证是完整单词
            boolean leftOk = (index == 0 || !Character.isLetterOrDigit(lowerText.charAt(index - 1)));
            boolean rightOk = (index + lowerTarget.length() == lowerText.length()
                    || !Character.isLetterOrDigit(lowerText.charAt(index + lowerTarget.length())));
            if (leftOk && rightOk) {
                count++;
                if (firstPosition == -1) {
                    firstPosition = index;
                }
            }

            index += lowerTarget.length(); // 移动到下一个位置
        }

        if (firstPosition == -1) {
            System.out.print(-1);
        } else {
            System.out.print(count + " " + firstPosition);
        }
    }
}
