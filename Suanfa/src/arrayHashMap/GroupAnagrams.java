package arrayHashMap;

import java.util.*;

/**
 * ClassName:GroupAnagrams
 * Description:
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null||strs.length==0) {
            return new ArrayList<>();
        }
        Map<String,List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String s = String.valueOf(charArray);
            if (!map.containsKey(s)) {
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
