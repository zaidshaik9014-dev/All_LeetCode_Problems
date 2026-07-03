public class RemoveDuplicatesII_80 {
    public static int remDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int left = 2;

        for (int right = 2; right < nums.length; right++) {
            if (nums[right] != nums[left - 2]) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = remDuplicates(nums);
        System.out.println("Length: " + k);
        System.out.print("Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}