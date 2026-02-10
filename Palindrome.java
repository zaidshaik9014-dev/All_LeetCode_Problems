import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        long rev = 0;
        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a Palindrome.");
        }
    }
}