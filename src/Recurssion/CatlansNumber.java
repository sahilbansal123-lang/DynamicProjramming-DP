package Recurssion;

public class CatlansNumber {
    public static int findCatlan(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (findCatlan(n-i-1) * findCatlan(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(findCatlan(4));
    }
}
