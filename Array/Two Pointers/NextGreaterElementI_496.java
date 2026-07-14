import java.util.Arrays;

public class NextGreaterElementI_496 {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = -1;

            for (int j = 0; j < nums2.length; j++) {

                // Find the current element of nums1 in nums2
                if (nums2[j] == nums1[i]) {

                    // Search towards the right
                    for (int k = j + 1; k < nums2.length; k++) {

                        if (nums2[k] > nums1[i]) {
                            ans[i] = nums2[k];
                            break;
                        }
                    }

                    // No need to search further in nums2
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = nextGreaterElement(nums1, nums2);

        System.out.println("Output: " + Arrays.toString(result));
    }
}