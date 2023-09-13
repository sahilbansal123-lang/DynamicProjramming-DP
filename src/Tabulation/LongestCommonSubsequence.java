package Tabulation;

public class LongestCommonSubsequence {

    public static int lcs(String str1, String str2) {

        int n = str1.length();
        int m = str2.length();

        // create Table
        int dp[][] = new int[n+1][m+1];

        // Initialization
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        if (dp[n][m] != 0) {
            return dp[n][m];
        }
        // fill in bottom up
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "dac";

        System.out.println(lcs(str1, str2));
    }
}
