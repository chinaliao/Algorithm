package JavaClass;

import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

/**
 * ClassName:Array
 * Description:
 */
public class Array {
    private int score;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return score == array.score;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(score);
    }

    @Override
    public String toString() {
        return "Array{" +
                "score=" + score +
                '}';
    }

    public Array(int score) {
        this.score = score;
    }

    public Array() {
    }

    public static void main(String[] args) {
        Array array = new Array(66);
        Array array1 = new Array(77);
        boolean equals = array.equals(array1);
        
    }

    @Test
    public void testArray(){
    int [] arr1 ={1,2,3};
    int[] arr2 = new int[5];
    System.arraycopy(arr1,1,arr2,2,2);
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
