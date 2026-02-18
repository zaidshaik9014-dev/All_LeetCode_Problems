import java.util.Scanner;

public class Tolowercase_709 {

    public static String toLowerCase(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32);
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = toLowerCase(input);

        System.out.println("Lowercase string: " + result);

        sc.close();
    }
}
