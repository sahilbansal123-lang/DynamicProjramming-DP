package Tabulation;

public class MatrixChainMultiplication {

    public static int mcm(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];
        // intitialization
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }
        // filling in Bottom Up Manner
        for (int len = 2; len <= n-1; len++) {
            for (int i = 1; i <= n-len; i++) {
                int j = i - len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j-1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
                }
            }
        }
        return dp[1][n-1];
    }

    public static void main(String[] args) {

    }
}
