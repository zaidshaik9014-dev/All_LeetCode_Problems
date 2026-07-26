//Brute Force O(n log n)
// import java.util.Arrays;

// public class LC_628_MaximumProductOfThreeNumbers {

//     public static int maximumProductBrute(int[] nums) {

//         Arrays.sort(nums);

//         int n = nums.length;

//         int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

//         int product2 = nums[0] * nums[1] * nums[n - 1];

//         return Math.max(product1, product2);
//     }

//     public static void main(String[] args) {

//         int[] nums = {-10, -10, 5, 2};

//         System.out.println("Brute Force Answer : "
//                 + maximumProductBrute(nums));
//     }
// }


//Optimised O(n)
public class LC_628_MaximumProductOfThreeNumbers {

    public static int maximumProductOptimized(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {

            // Three largest
            if (num >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if (num >= max2) {
                max3 = max2;
                max2 = num;
            }
            else if (num > max3) {
                max3 = num;
            }

            // Two smallest
            if (num <= min1) {
                min2 = min1;
                min1 = num;
            }
            else if (num < min2) {
                min2 = num;
            }
        }

        int product1 = max1 * max2 * max3;

        int product2 = max1 * min1 * min2;

        return Math.max(product1, product2);
    }

    public static void main(String[] args) {

        int[] nums = {-10, -10, 5, 2};

        System.out.println("Optimized Answer : "
                + maximumProductOptimized(nums));
    }
}