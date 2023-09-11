package Recurssion;

public class LongestCommonSubsequence {

    public static int lcs(String str1, int n, String str2, int m) {

        if (n == 0 || m == 0) {
            return 0;
        }

        int ans = 0;
        if (str1.charAt(n-1) == str2.charAt(m-1)) {
            ans = lcs(str1, n-1, str2, m-1);
            return ans+1;
        } else {
            int ans1 = lcs(str1, n-1, str2, m);
            int ans2 = lcs(str1, n, str2, m-1);
            ans = Math.max(ans1, ans2);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        int n = str1.length();
        int m = str2.length();
        System.out.println(lcs(str1, n, str2, m));
    }
}
