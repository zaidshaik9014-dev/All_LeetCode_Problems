public class MaxVowelsSubstring_1456 {

    public static boolean isVowel(char c) {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
               c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }

    public static int maxVowels(String s, int k) {

        if (s == null || s.length() == 0 || k > s.length()) {
            return 0;
        }

        int count = 0;

        // first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int mCount = count;

        // sliding window
        for (int i = k; i < s.length(); i++) {

            // add new char
            if (isVowel(s.charAt(i))) {
                count++;
            }

            // remove old char
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            mCount = Math.max(mCount, count);
        }

        return mCount;
    }

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;

        int result = maxVowels(s, k);

        System.out.println("Maximum vowels in any substring of size " + k + " = " + result);
    }
}