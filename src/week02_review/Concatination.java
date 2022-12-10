package week02_review;

public class Concatination {

    public static void main(String[] args) {
        String name = "James King";
        int age = 25;
        String companyName = "Apple";
        double salary = 85_000.5;

        name = "Kudret";
        age = 28;
        companyName = "Microsoft";
        salary = 100000;

        System.out.println("Hello, " + name + ", you are " + age + " years old");
        System.out.println(name + " works at " + companyName + " and makes " + salary + " dollars per year");




    }
}
