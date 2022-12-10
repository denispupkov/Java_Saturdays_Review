package week03_review;

public class DaysInWeek {

    public static void main(String[] args) {

        int day = 10;

        if (day>0 && day<8) {
            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        }else {
            if (day<1) {
                System.out.println("Minimum day number should be 1");
            }else {
                System.out.println("Maximum day number should be 7");
            }
        }


    }


}
