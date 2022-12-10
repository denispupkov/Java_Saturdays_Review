package week02_review;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        boolean aIsMedian = (b > a && a > c) || (c > a && a > b);
        boolean bIsMedian = (a > b && b > c) || (c > b && b > a);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) {
            System.out.println(a + " is the median number");
        }
    }
}
