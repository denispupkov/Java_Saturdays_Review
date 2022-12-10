package week07_review;

import java.util.Arrays;

public class MergedTwoArrays {

    public static void main(String[] args) {

        String [] arr1 = {"A","B","C","D"};
        String [] arr2 = {"E","F","G"};
        String [] arr3 = new String[arr1.length+arr2.length];

        int k = 0; //to keep tracking of third array

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        //System.out.println(Arrays.toString(arr3));

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

    }
}
