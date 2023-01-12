package week13_review;

public class Janitor extends Employee {

    public Janitor(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" "+getJobTitle()+" is cleaning");
    }
}
