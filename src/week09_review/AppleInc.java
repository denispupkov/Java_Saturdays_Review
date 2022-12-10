package week09_review;

import java.time.LocalDate;
import java.util.ArrayList;

public class AppleInc {

    public static void main(String[] args) {

        Tester [] testers = {
                new Tester("Sajjad",'M', LocalDate.of(1998,3,4),"A01","QA",100000),
                new Tester("Serhan",'M', LocalDate.of(1997,7,4),"A02","SDET",105000),
                new Tester("Anna",'F', LocalDate.of(1998,3,4),"A03","QE",110000)
        };
        Developer[] developers = {
                new Developer("Hilal", 'F', LocalDate.of(1982,12,4), "9874","Front end Developer",110000),
                new Developer("Mahmut", 'M', LocalDate.of(1989,4,14), "3265","Back end Developer",120000),
                new Developer("Ediz", 'M', LocalDate.of(2001,10,28), "9563","Developer",130000),
                new Developer("Hamid",'M',LocalDate.of(1989,10,10),"303","Developer",200000),
                new Developer("Serhan",'M',LocalDate.of(1990,11,25),"308","Developer",160000)
        };

        Developer dev2 = new Developer("Halima",'F',LocalDate.of(1997,12,4),"1224","Developer",122000);
        ScrumTeam scrum1 = new ScrumTeam("Nazar","Olzhas","Kudret",14);
        scrum1.addTesters(testers);
        scrum1.addDevelopers(developers);
        scrum1.addDeveloper(dev2);

        System.out.println(scrum1);

        scrum1.removeDeveloper("9563");

        System.out.println(scrum1);

        scrum1.removeTester("A02");

        System.out.println(scrum1);

        System.out.println("__________________");
        for (Tester eachTester : scrum1.testers) {
            System.out.println(eachTester.name+" : "+eachTester.salary);
        }
        System.out.println("__________________");
        for (Developer eachDeveloper : scrum1.developers) {
            System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);
        }

        System.out.println("__________________");

        ScrumTeam scrum2; //to store 4 testers and 7 devs
        ScrumTeam scrum3;

        System.out.println("__________________");

        //ArrayList<ScrumTeam> scrumTeams = new ArrayList<>();
        ScrumTeam[] scrumTeams = {scrum1};



    }


}
