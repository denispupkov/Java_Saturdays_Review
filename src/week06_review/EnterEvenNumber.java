package week06_review;

import java.util.Scanner;

public class EnterEvenNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = 0;
        System.out.println("Enter an even number");
        num = scan.nextInt();

        while (num%2!=0) {
            System.out.println("The number is not even. Please try again");
            num = scan.nextInt();
        }
        System.out.println("Your even number is "+num);
    }
}
