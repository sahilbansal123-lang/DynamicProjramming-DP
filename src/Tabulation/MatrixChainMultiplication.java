package Tabulation;

public class MatrixChainMultiplication {

    public static int mcm(int arr[], int i, int j) {
        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j-1; k++) {
            int cost1 = mcm(arr, i, k);
            int cost2 = mcm(arr, k+1, j);
            int cost3 = arr[i-1] * arr[k] * arr[j];

            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
