package week03_review;

import java.util.Scanner;

public class NextLineMethod2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Are you employed?");
        String employed = input.next();

        input.nextLine();

        System.out.println("Enter your job title ");
        String job_title = input.nextLine();

        System.out.println("Enter your salary");
        int salary = input.nextInt();

        System.out.println("salary = " + salary);
        System.out.println("job_title = " + job_title);
        System.out.println("employed = " + employed);

        input.close();

    }
}
