import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}

public class RotateArray_189 {
    public static void main(String[] args) {
        // Example from LeetCode
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        Solution sol = new Solution();
        sol.rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}