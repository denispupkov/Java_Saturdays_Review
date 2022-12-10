package week05_review;

public class MethodPractice_Void {

    public static void main(String[] args) {

        calculate(10.5,'-',5.5);
        calculate(20,'/',0);
        calculate(100,'+',200);



    }


    public static void calculate(double num1, char mathOperator, double num2) {

        if (num1<0 || num2 <0) {
            System.out.println("Both "+num1+" and "+num2+" are not positive");
            return;
        }

        //no double, boolean, float, long
        switch (mathOperator) {

            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;

            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                } else {
                    System.out.println(num1 + " cannot be divided by zero");
                }
                break;

            default:
                System.out.println("Invalid Math Operator");

        }

    }

     /*
        1. Create a method named calculate that accespt three arguments:
            1. num1 (double)
            2. operator (char)
            3. num2 (double)

        if the operator is +:
                the method should return the addition of the two numbers

        if the operator is -:
                the method should return the subtraction of the two numbers

        if the operator is *:
                the method should return the multiplication of the two numbers

        If the operator is /:
                if denominator is NOT zero:
                    then the method should return the division

        for any other operators, the method should return 0
         */
}
