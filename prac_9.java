public class CoinChange {

    public static void main(String[] args) {
        int coins[] = {1, 2, 5};
        int amount = 11;

        int dp[] = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            dp[i] = 999;
        }

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        System.out.println("Minimum coins: " + dp[amount]);
    }
}