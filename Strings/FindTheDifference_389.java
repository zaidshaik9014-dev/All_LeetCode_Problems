
import java.util.Scanner;

public class FindTheDifference_389 {

    public static char findTheDifference(String s, String t) {

        char result = 0;

        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        char extraChar = findTheDifference(s, t);

        System.out.println(extraChar);
    }
}
