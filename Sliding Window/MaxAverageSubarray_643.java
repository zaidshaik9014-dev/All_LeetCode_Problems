public class MaxAverageSubarray_643 {

    public static double findMaxAverage(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k > nums.length) {
            return 0.0;
        }

        int sum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int mSum = sum;

        // sliding window
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            mSum = Math.max(mSum, sum);
        }

        return (double) mSum / k;
    }

    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = findMaxAverage(nums, k);

        System.out.println("Maximum average of subarray of size " + k + " = " + result);
    }
}