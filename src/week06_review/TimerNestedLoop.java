package week06_review;

import java.util.Scanner;

public class TimerNestedLoop {

    public static void main(String[] args) throws InterruptedException {

       Scanner scan = new Scanner(System.in);

       System.out.println("please enter the number of minutes");
       int num = scan.nextInt();

        for (int minutes = num-1; minutes >=0 ; minutes--) {

            for (int seconds = 59; seconds >= 0; seconds--) {
                System.out.println(minutes + " minute(s) "+seconds+ " second(s)");
                Thread.sleep(1000);
            }
        }



    }
}
