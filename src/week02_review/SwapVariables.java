package week02_review;

public class SwapVariables {

    public static void main(String[] args) {

        int x = 100;
        int y = 200;
        int temp = x;

        x = y;
        y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("---------------------");

        int a = 10;
        int b = 20;

        a = a + b; // a = 30
        b = a - b; // b = 10
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);




    }
}
