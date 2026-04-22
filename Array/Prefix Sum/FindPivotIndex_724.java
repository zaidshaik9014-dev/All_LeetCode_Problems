class  FindPivotIndex_724{
    public int pivotIndex(int[] nums) {

        int total = 0;

        // Step 1: calculate total sum
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int leftSum = 0;

        // Step 2: traverse and find pivot
        for (int i = 0; i < nums.length; i++) {

            int rightSum = total - leftSum - nums[i];
            //total = leftSum + nums[i] + rightSum
            if (leftSum == rightSum) {
                return i;
            }

            // update leftSum AFTER checking
            leftSum += nums[i];
        }

        return -1; // no pivot found
    }

    // Example usage
    public static void main(String[] args) {
        FindPivotIndex_724 sol = new FindPivotIndex_724();

        int[] nums = {1, 7, 3, 6, 5, 6};

        int result = sol.pivotIndex(nums);

        System.out.println("Pivot Index: " + result);
    }
}