import java.util.Scanner;
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            // skip duplicates
            if(i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}