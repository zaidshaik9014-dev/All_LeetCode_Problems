public class RevVowels_345 {
    public static String revVow(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length - 1;

        while (left < right) {
            while (left < right && !isVowel(ch[left])) {
                left++;
            }

            while (left < right && !isVowel(ch[right])) {
                right--;
            }

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        return new String(ch);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String s  = "leetcode";
        System.out.println(revVow(s));
    }
}