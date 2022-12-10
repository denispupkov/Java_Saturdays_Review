package week08_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "aabcccdeeeef";

        ArrayList <String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);

        list.removeIf(p -> Collections.frequency(list,p) > 1); //remove the elements that are not unique
        System.out.println(list);
        str = list.toString().replace("[","").replace("]","").replace(", ","");
        System.out.println(str);

    }
}
