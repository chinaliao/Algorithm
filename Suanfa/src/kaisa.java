import java.util.Scanner;

/**
 * ClassName:kaisa
 * Description:
 */
public class kaisa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            c = (char) ((c-'a'+n)%26+'a');
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
