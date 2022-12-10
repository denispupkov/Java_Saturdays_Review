package week03_review;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer number");
        num = scan.nextInt();


        System.out.println("You have entered "+num);

        System.out.println("Enter a decimal number");
        double num2 = scan.nextDouble();

        System.out.println("You have entered "+num2);
    }
}
