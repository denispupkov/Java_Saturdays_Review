package week07_review;

public class MultidimensionalArray {

    public static void main(String[] args) {

        String [] row1 = {"Java","SQL","HTML","SCC","Python"};
        String [] row2 = {"Selenium","API","Jenkins"};
        String [] row3 = {"Cydeo","Wooden Spoon","Batch 28"};

        String [][] sheet1 = {row1,row2,row3};
        String [][] sheet2 = {row1,row2,row3};
        String [][] sheet3 = {row1,row2,row3};

        String [][][] file1 = {sheet1,sheet2,sheet3};

        System.out.println(sheet1[0][1]); // to get SQL as a result from sheet
        System.out.println(file1[0][0][1]); // to get SQL as a result from file
    }
}
