import java.util.Scanner;

public class MajorityElement_169 {

    public static int majorityElement(int[] nums) {

        int cand = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {

            if(count == 0) {
                cand = nums[i];
            }

            if(cand == nums[i]) {
                count++;
            }
            else {
                count--;
            }
        }

        return cand;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(majorityElement(nums));
    }
}
