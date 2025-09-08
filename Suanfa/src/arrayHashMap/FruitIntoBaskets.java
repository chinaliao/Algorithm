package arrayHashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:FruitIntoBaskets
 * Description:
 */
public class FruitIntoBaskets {
    public int fruitIntoBasket(int[] fruits){
        int n = fruits.length;
        int left = 0,ans = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int right = 0;right<n;++right){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if (map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                ++left;
            }
            ans = Math.max(ans,right-left+1);
        }return ans;
    }
}
