package week08_review;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        String [] names = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"};
        ArrayList <String> list =  new ArrayList<>(Arrays.
                asList(names));

        System.out.println(list);

        list.removeIf(p -> p.toLowerCase().substring(0,1).equals(p.toLowerCase().substring(p.length()-1)));

        System.out.println(list);

        names = list.toArray(new String [0]);
        System.out.println(Arrays.asList(names));

        int [] a1 = {10,20,30,40};

        //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a1));
        // will not work because of primitive types

        }
    }
    /*

    Write a program that can remove string elements from an arraylist if the first and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Lan", "Ebrahim", "Farida"]
     */

