package week06_review;

public class NestedLoopPractice2 {

    public static void main(String[] args) {

        String s = "abcabcabcabcbbbbdbb";
        String result = "";

        for (int j = 0; j < s.length(); j++) {

            char c = s.charAt(j);
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count++;
                }
            }
                if (result.contains(""+c)) {
                    continue;
                }
            result+=c+""+count;
        }
        System.out.println(result);
        }

    }

