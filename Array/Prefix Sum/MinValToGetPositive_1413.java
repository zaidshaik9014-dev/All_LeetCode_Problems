class MinValToGetPositive_1413 {
//1413. Minimum Value to Get Positive Step by Step Sum
    public int minStartValue(int[] nums) {
        int sum = 0;
        int minSum = 0;

        // Step 1: find minimum prefix sum
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            minSum = Math.min(minSum, sum);
        }

        // Step 2: calculate required start value
        return 1 - minSum;
    }

    // Example usage
    public static void main(String[] args) {
        MinValToGetPositive_1413 sol = new MinValToGetPositive_1413();

        int[] nums = {-3, 2, -3, 4, 2};

        int result = sol.minStartValue(nums);

        System.out.println("Minimum Start Value: " + result);
    }
}