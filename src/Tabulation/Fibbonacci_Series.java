package Tabulation;

public class Fibbonacci_Series {

    public static int fibbonacciOfN(int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        System.out.println(fibbonacciOfN(n, dp));
    }
}
