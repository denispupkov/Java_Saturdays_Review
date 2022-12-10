package week04_review;

public class StringMethodsPractice {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char ch = str.charAt(1);

        int length = str.length();

        int lastIndex = str.length()-1;

        char ch2 = str.charAt(lastIndex);

        int indexOfE = str.indexOf('e');

        int indexOfFirstO = str.indexOf("o");

        int indexOfSecondO = str.indexOf("oo");

        String s1 = "BATCH 28";

        s1 = s1.toLowerCase();

        String s2 = "I live in Virginia, I love Virginia";
        s2 = s2.replace("Virginia","Colorado");
        System.out.println("s2 = " + s2);
        s2 = s2.replaceFirst("Colorado","Denver");
        System.out.println("s2 = " + s2);

        String name = "dENiS";
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("name = " + name);

        String l = "Today we will have Java and Soft Skill classes";
        boolean hasSelenium = l.contains("Selenium");
        System.out.println("hasSelenium = " + hasSelenium);
        boolean hasJava = l.toLowerCase().contains("java");
        System.out.println("hasJava = " + hasJava);




    }
}
