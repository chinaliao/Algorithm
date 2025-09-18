package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * ClassName:PingPong
 * Description:
 */
public class PingPong {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = st.nextToken();
        StringBuilder sb = new StringBuilder().append(input);
        String line;


        while ((line= br.readLine())!=null && !line.isEmpty()){
            sb.append(line);
        }
        int w11 = 0, l11 = 0;  // 11分制计分
        int w21 = 0, l21 = 0;  // 21分制计分
        List<String> result11 = new ArrayList<>();
        List<String> result21 = new ArrayList<>();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == 'E') {
                result11.add(w11 + ":" + l11);
                result21.add(w21 + ":" + l21);
                break;
            }
            if (ch == 'W') {
                w11++; w21++;
            } else if (ch == 'L') {
                l11++; l21++;
            }

            // 判断11分制结束
            if ((w11 >= 11 || l11 >= 11) && Math.abs(w11 - l11) >= 2) {
                result11.add(w11 + ":" + l11);
                w11 = l11 = 0;
            }

            // 判断21分制结束
            if ((w21 >= 21 || l21 >= 21) && Math.abs(w21 - l21) >= 2) {
                result21.add(w21 + ":" + l21);
                w21 = l21 = 0;
            }
        }

        // 输出11分制
        for (String r : result11) {
            System.out.println(r);
        }
        System.out.println(); // 空行隔开
        // 输出21分制
        for (String r : result21) {
            System.out.println(r);
        }
        }
    }

