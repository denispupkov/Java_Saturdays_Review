package week13_review;

public class Driver extends Employee {

    private char typeOfDL;

    public char getTypeOfDL() {
        return typeOfDL;
    }

    public Driver(String name, int age, char gender, String id, double salary, char typeOfDL) {
        super(name, age, gender, id, "Driver", salary);
        setTypeOfDL(typeOfDL);
    }

    public void setTypeOfDL(char typeOfDL) {
        if (!(typeOfDL=='A' || typeOfDL=='B' || typeOfDL=='C')) {
            throw new RuntimeException("Type of DL cannot be other than A, B or C");
        }
        this.typeOfDL = typeOfDL;
    }

    @Override
    public void work() {
        System.out.println(getName()+" "+getJobTitle()+" is driving");
    }


}
