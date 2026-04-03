// Last updated: 03/04/2026, 13:12:01
1class Solution {
2    public int change(int amount, int[] coins) {
3
4        int[] dp = new int[amount + 1];
5        dp[0] = 1; // base case
6
7        for (int coin : coins) {
8            for (int j = coin; j <= amount; j++) {
9                dp[j] += dp[j - coin];
10            }
11        }
12
13        return dp[amount];
14    }
15}