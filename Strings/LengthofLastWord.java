import java.util.Scanner;
public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        String str = s.trim();//Used to remove the extra spaces
        int count = 0;

        for(int i = str.length() - 1; i >= 0; i--) {//traverse from end to front
            if(str.charAt(i) != ' ') { //count until present char is a space
                count++;
            }else { //if present char equals to space, break
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord(s));
    }
}
