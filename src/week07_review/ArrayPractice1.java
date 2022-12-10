package week07_review;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice1 {

    public static void main(String[] args) {

        int [] scores = {10,11,12,13,14,15};
        System.out.println(Arrays.toString(scores));

        System.out.println("-----------------------");

        int [] numbers = new int[5];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number");
            numbers[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

    }
}
