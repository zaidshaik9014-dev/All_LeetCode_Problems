import java.util.*;

public class MaxScore_1422 {
//max Score after splitting a string
    public static int maxScore(String s) {
        int totalOnes = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                totalOnes++;
            }
        }

        int zeros = 0;
        int ones = totalOnes;
        int maxScore = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones--;
            }

            maxScore = Math.max(maxScore, zeros + ones);
        }

        return maxScore;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//for ex give 011101
        String s = sc.next();

        System.out.println(maxScore(s));

        sc.close();
    }
}