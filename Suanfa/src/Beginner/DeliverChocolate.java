package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ClassName:DeliveryChocolate
 * Description:
 */
public class DeliverChocolate {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sc = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(sc.nextToken());
        long K = Long.parseLong(sc.nextToken());
        long[] H = new long[N];
        long[] W = new long[N];
        long maxDim = 0;
        for (int i = 0; i < N; i++) {
            H[i] =Long.parseLong(sc.nextToken());
            W[i] = Long.parseLong(sc.nextToken());
            if (H[i] > maxDim) maxDim = H[i];
            if (W[i] > maxDim) maxDim = W[i];
        }
        long least = 1,hi = maxDim,ans = 0;
        while(least<=hi){
            long mid = (least+hi)>>>1;
            if (check(mid,K,H,W)){
                ans = mid;
                least = mid+1;
            }else hi = mid-1;
        }
        System.out.println(ans);
    }
    static Boolean check(long len,long K, long[] H, long[] W){
        long sum = 0;
        for (int i = 0; i < H.length; i++) {
            long a = H[i]/len;
            long b = W[i]/len;
            if (a==0||b==0) continue;
            sum+=a*b;
            if (sum>=K) return true;
        }
            return sum>=K;
    }
}
