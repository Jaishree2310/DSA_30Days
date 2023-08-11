//518. Coin Change II


public class Day9_Q1 {
    public static void main(String[] args) {
        // You can add code here to test your change method
        int amount = 5;
        int[] coins = {1, 2, 5};
        Day9_Q1 solution = new Day9_Q1();
        int ways = solution.change(amount, coins);
        System.out.println("Number of ways to make " + amount + " cents: " + ways);
    }

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }

        return dp[amount];
    }
}


