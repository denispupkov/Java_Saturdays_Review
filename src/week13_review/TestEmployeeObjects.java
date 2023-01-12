package week13_review;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee;

        employee = new Tester("Josh",35,'M',"A01","Manual Tester",100000);

        employee.work();
        Tester tester = ((Tester)employee);
        tester.smokeTesting();


        employee = new Developer("Bella",30,'F',"A02","Java Developer",100000);

        employee.work();
        ((Developer)employee).unitTesting();
        ((Developer)employee).workFromHome();

        employee = new Teacher("Jimmy",36,'M',"A03",100000);
        employee.work();
        ((RemoteJob)employee).workFromHome();


        employee = new Driver("Aaron",40,'M',"B01",110000,'A');

        employee.work();
        System.out.println(employee);

        employee = new Janitor("Daniel",38,'M',"C01","Janitor",90000);

        employee.work();
        System.out.println(employee);

        System.out.println(employee);

        Employee [] employees = {
                new Tester("Josh",35,'M',"A01","Manual Tester",100000),
                new Developer("Bella",30,'F',"A02","Java Developer",100000),
                new Teacher("Jimmy",36,'M',"A03",100000),
                new Driver("Aaron",40,'M',"B01",110000,'A'),
                new Janitor("Daniel",38,'M',"C01","Janitor",90000)
        };

        int countTesters = 0;
        for (Employee each : employees) {
            each.work();

            if (each instanceof Tester) {
                countTesters++;
            }
        }
        



    }
}
