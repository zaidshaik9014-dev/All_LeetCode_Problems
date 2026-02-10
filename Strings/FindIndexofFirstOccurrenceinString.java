import java.util.Scanner;

public class FindIndexofFirstOccurrenceinString {

    public static int strStr(String haystack, String needle) {

        for(int i = 0; i <= haystack.length() - needle.length(); i++) {

            if(haystack.charAt(i) == needle.charAt(0)) {

                if(haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String haystack = sc.nextLine();
        String needle = sc.nextLine();

        System.out.println(strStr(haystack, needle));
    }
}
