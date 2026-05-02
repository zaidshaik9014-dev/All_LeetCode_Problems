public class BestTimeToBuySellStock_121 {

    public static int maxProfit(int[] prices) {
        int left = 0;   // buy day
        int right = 1;  // sell day
        int maxProfit = 0;

        while (right < prices.length) {

            if (prices[right] > prices[left]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right; // found a better (cheaper) buying day
            }

            right++;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println(result); // Output: 5
    }
}