import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks_506 {

    public static String[] findRelativeRanks(int[] score) {

        int n = score.length;

        int[] sorted = score.clone();

        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for (int i = n - 1; i >= 0; i--) {
            map.put(sorted[i], rank);
            rank++;
        }

        String[] ans = new String[n];

        for (int i = 0; i < n; i++) {

            int currentRank = map.get(score[i]);

            if (currentRank == 1) {
                ans[i] = "Gold Medal";
            } else if (currentRank == 2) {
                ans[i] = "Silver Medal";
            } else if (currentRank == 3) {
                ans[i] = "Bronze Medal";
            } else {
                ans[i] = String.valueOf(currentRank);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] score = {10, 3, 8, 9, 4};

        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
}