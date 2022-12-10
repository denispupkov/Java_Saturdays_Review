package week08_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthMaxNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int n = 5;

        for (int i = 0; i < n-1; i++) {


            list.removeIf(p -> p == Collections.max(list));

            System.out.println(list);
        }
        System.out.println("5th Max number is "+Collections.max(list));

    }


}
