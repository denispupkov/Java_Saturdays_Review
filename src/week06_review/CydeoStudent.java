package week06_review;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public boolean isMarried;
    public boolean isEmployed;
    public int batchNumber;
    public String programmingLanguage;
    public String groupName;

    //public static String schoolName = "Cydeo"; //will be the same for all objects


    public void setInfo(String name, int age, char gender, boolean isMarried, boolean isEmployed, int batchNumber, String programmingLanguage, String groupName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        this.batchNumber = batchNumber;
        this.programmingLanguage = programmingLanguage;
        this.groupName = groupName;
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                ", batchNumber=" + batchNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }


    public void study () {
        System.out.println(name+" is studying "+programmingLanguage);
    }
}
