package week06_review;

public class TestObjects {

    public static void main(String[] args) {

        CydeoStudent cydeoStudent1 = new CydeoStudent();

        cydeoStudent1.setInfo("Jared",33,'M',true,true,28
        ,"Java","Inheritance");

        CydeoStudent cydeoStudent2 = new CydeoStudent();
        cydeoStudent2.setInfo("Mike",25,'M',false,false,28,
                "Java","Integer");

        CydeoStudent cydeoStudent3 = new CydeoStudent();
        cydeoStudent3.setInfo("Lucy",23,'F',false,true,28,
                "Java","Boolean");

        System.out.println("cydeoStudent1 = " + cydeoStudent1);
        System.out.println("cydeoStudent2 = " + cydeoStudent2);
        System.out.println("cydeoStudent3 = " + cydeoStudent3);

        cydeoStudent1.study();
        cydeoStudent2.study();
        cydeoStudent3.study();



    }
}
