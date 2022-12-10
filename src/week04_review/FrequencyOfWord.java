package week04_review;

public class FrequencyOfWord {

    public static void main(String[] args) {

        //finding the number of word repetition without using loop (but using replace () method
        // we need to replace the searching word with  any another word with less than 1 characters
        // for example java has 4 characters, we should replace it with any word with 3 characters
        String sentence = "Java Java Java Java Python C# Ruby C++ Swift";
        int originalLength = sentence.length();
        String temp = sentence.replace("Java","abc");

        int newLength = temp.length();
        System.out.println(sentence);
        System.out.println(temp);
        System.out.println(originalLength);
        System.out.println(newLength);

        int frequencyOfJava = originalLength-newLength;
        System.out.println(frequencyOfJava);
    }
}
