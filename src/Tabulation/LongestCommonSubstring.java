package Tabulation;

public class LongestCommonSubstring {

    public static int lcSubstring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int ans = 0;
        int dp[][] = new int[n+1][m+1];

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

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "abdce";

        System.out.println(lcSubstring(str1, str2));
    }
}
