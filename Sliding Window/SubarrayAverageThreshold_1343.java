public class SubarrayAverageThreshold_1343 {

    public static int numOfSubarrays(int[] arr, int k, int threshold) {

        int sum = 0, result = 0;

        // first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum / k >= threshold) {
            result++;
        }

        // sliding window
        for (int i = k; i < arr.length; i++) {

            sum = sum - arr[i - k] + arr[i];

            if (sum / k >= threshold) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;

        int result = numOfSubarrays(arr, k, threshold);

        System.out.println("Number of valid subarrays = " + result);
    }
}