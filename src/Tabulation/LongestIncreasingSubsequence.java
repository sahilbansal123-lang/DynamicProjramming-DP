package Tabulation;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class LongestIncreasingSubsequence {

    public static int lcs(int arr[], int arr2[]) {
        //      -------------------MAIN FUNCTION NOW PERFORM SIMPLE LCS-------------
        int n = arr.length;;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];

        if (dp[n][m] != 0) {
            return dp[n][m];
        }

        for (int k = 0; k < n+1; k++) {
            for (int j = 0; j < m+1; j++) {
                if (k == 0 || j == 0) {
                    dp[k][j] = 0;
                }
            }
        }

        for (int j = 1; j < n+1; j++) {
            for (int k = 1; k < m+1; k++) {
                if (arr[j-1] == arr2[k-1]) {
                    dp[j][k] = dp[j-1][k-1] + 1;
                } else {
                    int ans1 = dp[j-1][k];
                    int ans2 = dp[j][k-1];
                    dp[j][k] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }

    public static int LIS(int arr[]) {

//      ------------------SORTING OF ARRAY INTO ARR2-----------------------
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int[] arr2 = new int[set.size()];

        int i = 0;
        for (Integer num : set) {
            arr2[i++] = num;
        }
        Arrays.sort(arr2);

        return lcs(arr, arr2);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 10, 7, 40, 80};
        System.out.println(LIS(arr));
    }
}
