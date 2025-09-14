package arrayHashMap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Search2 {
    static int[] arr;

    public static void main(String[] args) throws Exception {
        Read sc = new Read();
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            int target = sc.nextInt();
            int index = binarySearch(target);
            sb.append(index).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    static int binarySearch(int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left] == target ? left + 1 : -1;
    }

    static class Read {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        public int nextInt() throws Exception {
            st.nextToken();
            return (int) st.nval;
        }
    }
}
