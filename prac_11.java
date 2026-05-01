public class MCM {

    public static void main(String[] args) {
        int p[] = {1, 2, 3, 4};
        int n = p.length;

        int dp[][] = new int[n][n];

        for (int l = 2; l < n; l++) {
            for (int i = 1; i < n - l + 1; i++) {
                int j = i + l - 1;
                dp[i][j] = 9999;

                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + p[i - 1] * p[k] * p[j];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }

        System.out.println("Minimum cost: " + dp[1][n - 1]);
    }
}