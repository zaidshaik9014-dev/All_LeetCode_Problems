public class SortArrayByParity_905 {

    public static void sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right ) {
            if (nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if (nums[left] % 2 == 0) left++;
            if (nums[right] % 2 == 1) right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};

        sortArrayByParity(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}