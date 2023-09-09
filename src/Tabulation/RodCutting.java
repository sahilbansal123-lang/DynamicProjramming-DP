package Tabulation;

public class RodCutting {

    public static int rodCutting(int[] length, int[] price, int L) {
        int n = length.length;
        int[][] dp = new int[n+1][L+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < L+1; j++) {
                if (length[i-1] <= j) {
                    dp[i][j] = Math.max(price[i-1] + dp[i][j-length[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][L];
    }

    public static void main(String[] args) {
        int[] length = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] price =  {1, 5, 8, 9, 10, 17, 17, 20};
        int L = 8;

        System.out.println(rodCutting(length, price, L));
    }
}
