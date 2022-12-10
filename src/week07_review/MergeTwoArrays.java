package week07_review;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        String [] arr1 = {"A","B","C","D"};
        String [] arr2 = {"E","F","G"};
        String [] arr3 = new String[arr1.length+arr2.length];
        
        int k = 0;

        for (String each : arr1) {
            arr3[k++] = each;
        }
        for (String each : arr2) {
            arr3[k++] = each;

        }
        System.out.println(Arrays.toString(arr3));
    }
}
