package Tabulation;

public class CoinChange {
    public static int coinChange(int arr[], int sum) {
        int n = arr.length;
        int dp[][] = new int[n+1][sum+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if (arr[i-1] <= j) { // valid
                    dp[i][j] = dp[i][j-arr[i-1]] + dp[i-1][j];;// include
                } else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int sum = 4;
        System.out.println(coinChange(arr, sum));
    }
}