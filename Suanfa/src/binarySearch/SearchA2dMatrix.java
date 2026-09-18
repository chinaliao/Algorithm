package binarySearch;

/**
 * ClassName:SearchA2dMatrix
 * Description:
 */
public class SearchA2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null||matrix.length==0||matrix[0].length==0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m*n-1;
        while (left<=right){
            int mid = left-(left-right)/2;
            int midValue = matrix[mid/n][mid%n];

            if (target==midValue) {
                return true;
            }
            if (target>midValue){
                left=mid+1;
            }
            if (target<midValue){
                right=mid-1;
            }
        }
        return false;
    }
}
