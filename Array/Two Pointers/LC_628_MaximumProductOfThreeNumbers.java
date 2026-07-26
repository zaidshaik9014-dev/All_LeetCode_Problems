import java.util.Arrays;

public class LC_628_MaximumProductOfThreeNumbers {

    public static int maximumProductBrute(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }

    public static void main(String[] args) {

        int[] nums = {-10, -10, 5, 2};

        System.out.println("Brute Force Answer : "
                + maximumProductBrute(nums));
    }
}