package Tabulation;

import java.util.HashSet;

public class LongestIncreasingSubsequence {

    public static int LIS(int arr[]) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int arr2[] = new int[set.size()];
        arr2 = set.toArray(arr2);
    }

    public static void main(String[] args) {

    }
}
