public class IsSubsequence_392 {

    public static boolean isSubsequence(String s, String t) {
        int i = 0; // pointer for s

        for (int j = 0; j < t.length(); j++) {
            if (i < s.length() && s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        boolean result = isSubsequence(s, t);
        System.out.println("Is subsequence: " + result);
    }
}