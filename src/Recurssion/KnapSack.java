package Recurssion;

public class KnapSack {

    public static int knapSack(int val[], int wt[], int totalWeight, int n) {
        if (totalWeight == 0 || n == 0) {
            return 0;
        }

        if (wt[n-1] <= totalWeight) { // Valid condition
            // include
            int ans1 = val[n-1] + knapSack(val, wt, totalWeight - wt[n-1], n-1);
            // exclude
            int ans2 = knapSack(val, wt, totalWeight, n-1);
            return Math.max(ans1, ans2);
        } else {
            return knapSack(val, wt, totalWeight, n-1);
        }
    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int totalWeight = 7;
        System.out.println(knapSack(val, wt, totalWeight, val.length));
    }
}
