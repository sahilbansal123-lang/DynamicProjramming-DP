package Recurssion;

public class ClimbingStairWays {

    public static int climbingStairsWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        return climbingStairsWays(n-1) + climbingStairsWays(n-2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(climbingStairsWays(n));
    }
}
