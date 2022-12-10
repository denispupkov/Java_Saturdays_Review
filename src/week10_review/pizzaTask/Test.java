package week10_review.pizzaTask;

public class Test {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small",2,3);

        System.out.println(pizza1);

        pizza1.setSize("large");
        pizza1.setNumberOfPepperoniTopping(5);
        System.out.println(pizza1);
    }
}
