package Tabulation;

import java.util.HashSet;

public class LongestIncreasingSubsequence {

    public static int LIS(int arr[]) {

//      ------------------SORTING OF ARRAY INTO ARR2-----------------------
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int[] arr2 = new int[set.size()];
        int i = 0;
        for (int num: set) {
            arr2[i] = num;
            i++;
        }
//      -------------------MAIN FUNCTION NOW PERFORM SIMPLE LCS-------------


    }

    public static void main(String[] args) {

    }
}
