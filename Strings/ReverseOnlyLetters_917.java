import java.util.Scanner;

public class ReverseOnlyLetters_917 {

    public static String reverseOnlyLetters(String s) {

        int start = 0, end = s.length() - 1;
        char[] ch = s.toCharArray();

        while (start < end) {

            if (!Character.isLetter(ch[start])) {
                start++;
            } 
            else if (!Character.isLetter(ch[end])) {
                end--;
            } 
            else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;

                start++;
                end--;
            }
        }

        return new String(ch);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = reverseOnlyLetters(input);

        System.out.println("Result: " + result);

        sc.close();
    }
}
