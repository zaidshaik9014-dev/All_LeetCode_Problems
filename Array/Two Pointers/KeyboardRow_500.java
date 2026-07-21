import java.util.ArrayList;
import java.util.Arrays;

public class KeyboardRow_500 {

    public static String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> result = new ArrayList<>();

        for (String word : words) {

            String lower = word.toLowerCase();

            String row;

            if (row1.indexOf(lower.charAt(0)) != -1) {
                row = row1;
            } else if (row2.indexOf(lower.charAt(0)) != -1) {
                row = row2;
            } else {
                row = row3;
            }

            boolean valid = true;

            for (int i = 1; i < lower.length(); i++) {
                if (row.indexOf(lower.charAt(i)) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {

        String[] words = {"Hello", "Alaska", "Dad", "Peace"};

        System.out.println(Arrays.toString(findWords(words)));
    }
}