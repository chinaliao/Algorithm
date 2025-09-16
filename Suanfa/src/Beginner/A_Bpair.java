package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * ClassName:A_Bpair
 * Description:
 */
public class A_Bpair {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
       Map<Long,Long> map = new HashMap<>(N*2);
        for (int i = 0; i < N; i++) {
            long key = Long.parseLong(st.nextToken());
            map.put(key,(map.getOrDefault(key,0L)+1));
        }
        Long ans = 0L;
        //如果允许C==0
        if (C==0L){
            for (Long value : map.values()) {
                ans+=value*(value-1);
            }
        }else {
            for (Map.Entry<Long, Long> entry : map.entrySet()) {
                Long x = entry.getKey();
                Long countX = entry.getValue();
                long y = x - C;
                Long countY = map.get(y);
                if (countY != null) {
                    ans+=countX*countY;
                }
            }
        }
        System.out.println(ans);
    }
}
