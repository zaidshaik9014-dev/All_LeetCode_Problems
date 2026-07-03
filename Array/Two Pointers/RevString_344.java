public class RevString_344 {
    public static void rev(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        rev(s);
        for(char c : s){
            System.out.print(c + " ");
        }
    }
}