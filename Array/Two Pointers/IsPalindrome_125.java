public class IsPalindrome_125 {

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        // 👇 your test string (THIS is what you meant)
        String t = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(t);

        System.out.println("Input: " + t);
        System.out.println("Is palindrome? " + result);
    }
}