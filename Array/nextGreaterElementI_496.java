import java.util.*;

class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {

            // Remove all elements smaller than or equal to current element
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element exists
            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], stack.peek());
            }

            // Push current element into stack
            stack.push(nums2[i]);
        }

        // Build answer using the HashMap
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}

public class nextGreaterElementI_496 {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = obj.nextGreaterElement(nums1, nums2);

        System.out.println("Output:");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}