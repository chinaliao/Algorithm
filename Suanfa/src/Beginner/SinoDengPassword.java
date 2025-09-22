package Beginner;

import java.util.*;

/**
 * ClassName:SinoDengPassword
 * Description:
 */
public class SinoDengPassword {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("zero","0");map.put("one","1");map.put("two","2");map.put("three","3");map.put("four","4");map.put("five","5");
        map.put("six","6");map.put("seven","7");map.put("eight","8");map.put("nine","9");map.put("ten","10");
        map.put("eleven","11");map.put("twelve","12");map.put("thirteen","13");map.put("fourteen","14");map.put("fifteen","15");
        map.put("sixteen","16");map.put("seventeen","17");map.put("eighteen","18");map.put("nineteen","19");map.put("twenty","20");
        map.put("a","1");map.put("both","2");map.put("another","1");map.put("first","1");map.put("second","2");map.put("third","3");
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().trim().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String s : split) {
            if (map.containsKey(s)){
                numbers.add(Integer.parseInt(map.get(s)));
            }
        }
        int[] array = numbers.stream()
                .map(n -> (n * n) % 100)
                .mapToInt(Integer::intValue).sorted().toArray();
//        String result = "";
        StringBuilder sb = new StringBuilder();
        for (int v : array) {
            // 格式化为两位，0 -> "00", 4 -> "04", 25 -> "25"
            sb.append(String.format("%02d", v));
        }

        // 去掉前导零
        String result = sb.toString().replaceFirst("^0+", "");
        if (result.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }

    }
}
