class NumArray_303 {
    int[] prefix;
    //step-1: Build prefix array
    public NumArray_303(int[] nums) {
        int n = nums.length;
        prefix = new int[n];

        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    // Step 2: Answer query
    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
 
     // Example usage
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 7, 3};

        NumArray_303 obj = new NumArray_303(nums);

        System.out.println(obj.sumRange(1, 3)); // 12
        System.out.println(obj.sumRange(0, 4)); // 17
    }
}