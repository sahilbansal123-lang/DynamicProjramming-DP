package Tabulation;

public class TargetSum {

    public static boolean targetSum(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }

    }

    public static void main(String[] args) {

    }
}
