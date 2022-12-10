package week08_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysListPractice {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,40,60,90));

        list.addAll(3,Arrays.asList(45,65,75));

        System.out.println(list);

        list.addAll(0,Arrays.asList(10,10));

        System.out.println(list);

        list.removeAll(Arrays.asList(45,40,90));

        System.out.println(list);

        list.remove(Integer.valueOf(75));

        System.out.println(list);

        Integer a = 60;

        list.remove(a);

        System.out.println(list);

        list.remove((Integer)10);

        System.out.println(list);

        System.out.println("_______________________");

        ArrayList<Integer> numbers = new ArrayList<>(list); // first addition
        numbers.addAll(list); //second addition
        System.out.println(numbers);
        numbers.addAll(Arrays.asList(100,200,300,400,500));
        System.out.println(numbers);

        numbers.retainAll(Arrays.asList(65,300,400));
        System.out.println(numbers);

        System.out.println("___________________");

        ArrayList <String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","SoftSkills","Selenium","API","Wooden Spoon"));
        System.out.println(names.get(2).charAt(2));

        System.out.println("___________________");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(10,20,30,40,50,60,70,50,10,20,30,40,50,60));
        nums.removeIf(p -> p < 20);
    }
}
