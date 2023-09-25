package Memoization;

import java.util.Arrays;

public class MatrixChainMultiplication {

    public stati

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;

        int dp[][] = new int[n][n];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
    }
}
