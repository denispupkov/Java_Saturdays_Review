package week03_review;

import java.util.Scanner;

public class NextLineMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("age = " + age);

        scan.nextLine();

        System.out.println("Enter your school name");

        String schoolName = scan.nextLine();

        System.out.println("schoolName = " + schoolName);
    }
}
