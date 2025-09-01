package arrayHashMap;

/**
 * ClassName:BinarySearch
 * Description:
 */
public class BinarySearch {
    public int binarySearch(int []nums , int target){
        int left = 0;
        int right = nums.length-1;
        while (left <= right) { // 当left==right，区间[left, right]依然有效，所以⽤ <=
            int middle = left + ((right - left) / 2);// 防⽌溢出 等同于(left + right)/2
            if (nums[middle] > target) {
                right = middle - 1; // target 在左区间，所以[left, middle - 1]
            } else if (nums[middle] < target) {
                left = middle + 1; // target 在右区间，所以[middle + 1, right]
            } else { // nums[middle] == target
                return middle; // 数组中找到⽬标值，直接返回下标
            }
        }
// 未找到⽬标值
        return -1;
    }
}
