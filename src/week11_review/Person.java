package week11_review;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setAge(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name==null) {
            System.out.println("The name cannot be empty or null");
            System.out.println("");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0) {
            System.out.println("The "+age+" cannot be 0 or negative");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender + '\'' ;
    }
}
