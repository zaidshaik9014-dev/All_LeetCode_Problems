public class JumpGame_55 {
    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
    public static void main(String[] args) {

        // Test Case 1
        int[] nums1 = {2, 3, 1, 1, 4};

        // Test Case 2
        int[] nums2 = {3, 2, 1, 0, 4};

        // Test Case 3
        int[] nums3 = {2, 0, 0};

        // Test Case 4
        int[] nums4 = {1, 2, 0, 1, 0};

        System.out.println("Test Case 1: " + canJump(nums1)); // true
        System.out.println("Test Case 2: " + canJump(nums2)); // false
        System.out.println("Test Case 3: " + canJump(nums3)); // true
        System.out.println("Test Case 4: " + canJump(nums4)); // true
    }
}