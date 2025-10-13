package StackQuene;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName:DailyTemperatures
 * Description:
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!q.isEmpty() &&temperatures[i]>temperatures[q.getLast()]){
                Integer last = q.removeLast();
                answer[last] = i-last;
            }
            q.add(i);
        }
        return answer;
    }
    @Test
    public void testStack(){
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] answer = dailyTemperatures(temperatures);
        for (int j : answer) {
            System.out.print(j);
        }
    }
}
