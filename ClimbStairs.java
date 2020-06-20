
public class ClimbStairs {

    public static void main(String[] args) {
        int n = 8;
        System.out.println(climbStairs(n));
    }

    private static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        if (n <= 2) {
            return n;
        }
        for (int i = 2;i <= n;i++) {
            dp[i] = dp[i -1] + dp[i - 2];
        }

        return dp[n];
    }
}