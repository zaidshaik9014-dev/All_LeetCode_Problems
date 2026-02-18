import java.util.Arrays;
import java.util.Scanner;

public class PlusOne_66 {

    public static int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {
            
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();
        
        int[] digits = new int[n];
        
        System.out.println("Enter digits one by one:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        
        int[] result = plusOne(digits);
        
        System.out.println("Result after adding 1:");
        System.out.println(Arrays.toString(result));
        
        sc.close();
    }
}
