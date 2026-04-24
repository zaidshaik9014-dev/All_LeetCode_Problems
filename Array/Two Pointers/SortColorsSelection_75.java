public class SortColorsSelection_75 {

    public static void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1, mid = 0;

        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            } else {
                mid++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        sortColors(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}