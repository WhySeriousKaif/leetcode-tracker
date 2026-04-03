// Last updated: 03/04/2026, 13:10:24
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3
4        int n = coins.length;
5        int[][] t = new int[n + 1][amount + 1];
6
7        // Initialize
8        for (int j = 1; j <= amount; j++) {
9            t[0][j] = Integer.MAX_VALUE - 1;
10        }
11
12        // Fill DP
13        for (int i = 1; i <= n; i++) {
14            for (int j = 1; j <= amount; j++) {
15
16                if (coins[i - 1] <= j) {
17                    t[i][j] = Math.min(
18                        1 + t[i][j - coins[i - 1]],  // take
19                        t[i - 1][j]                  // not take
20                    );
21                } else {
22                    t[i][j] = t[i - 1][j];
23                }
24            }
25        }
26
27        return t[n][amount] >= Integer.MAX_VALUE - 1 ? -1 : t[n][amount];
28    }
29}