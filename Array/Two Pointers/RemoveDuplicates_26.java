public class RemoveDuplicates_26 {
    public static int removeDuplicates(int[] a) {
        if (a.length == 0) return 0;

        int left = 0;
        for (int right = 1; right < a.length; right++) {
            if (a[right] != a[left]) {
                left++;
                a[left] = a[right];
            }
        }

        return left + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};

        int len = removeDuplicates(arr);

        System.out.print("Result: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}