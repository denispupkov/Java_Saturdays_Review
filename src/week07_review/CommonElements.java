package week07_review;

public class CommonElements {

    public static void main(String[] args) {

        String [] arr1 = {"Python","Java","C#","Wooden Spoon","Swift","Java"};
        String [] arr2 = {"Selenium","SQL","Java","API","Jenkins","Wooden Spoon"};


        for (String element : arr1) {
            for (String each : arr2) {
                if (each.equals(element)) {
                    System.out.println(each);
                }
            }
        }


    }
}
