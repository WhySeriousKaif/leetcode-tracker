// Last updated: 02/04/2026, 20:56:07
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        int sum = 0;
4        for(int num : nums) sum += num;
5
6        // Edge cases
7        if((sum + target) % 2 != 0 || sum < Math.abs(target)) {
8            return 0;
9        }
10
11        int s1 = (sum + target) / 2;
12
13        return countSubsets(nums, s1);
14    }
15
16    private int countSubsets(int[] nums, int sum) {
17        int n = nums.length;
18        
19        int[][] dp = new int[n + 1][sum + 1];
20        dp[0][0] = 1;
21
22        for(int i = 1; i <= n; i++){
23            for(int j = 0; j <= sum; j++){
24                
25                if(nums[i - 1] == 0){
26                    dp[i][j] = 2 * dp[i - 1][j];
27                }
28                else if(nums[i - 1] <= j){
29                    dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
30                }
31                else{
32                    dp[i][j] = dp[i - 1][j];
33                }
34            }
35        }
36
37        return dp[n][sum];
38    }
39}