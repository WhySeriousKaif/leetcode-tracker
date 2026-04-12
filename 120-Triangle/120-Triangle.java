// Last updated: 13/04/2026, 00:22:54
1public class Solution {
2    public int minimumTotal(List < List < Integer >> A) {
3        int m, n;
4        m = A.size();
5        n = A.get(m - 1).size();
6        int[] dp = new int[n + 1];
7        int size = n;
8        for (int i = m - 1; i >= 0; i--) {
9            for (int j = 0; j < size; j++) {
10                dp[j] = Math.min(dp[j], dp[j + 1]) + A.get(i).get(j);
11            }
12            size--;
13        }
14        return dp[0];
15    }
16}