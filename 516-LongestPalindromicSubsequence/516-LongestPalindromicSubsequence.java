// Last updated: 14/04/2026, 16:46:20
1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        int n=s.length();
4        int[][] dp=new int[n][n];
5
6        for(int i=0;i<n;i++){
7            dp[i][i]=1;
8        }
9        for(int L=2;L<=n;L++){
10            for(int i=0;i<n-L+1;i++){
11                int j=i+L-1;
12                if(s.charAt(i)==s.charAt(j)){
13                    if(L==2){
14                        dp[i][j]=2;
15                    }
16                    else{
17                        dp[i][j]=2+dp[i+1][j-1];
18                    }
19                }
20                else{
21                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
22                }
23            }
24
25        }
26        return dp[0][n-1];
27        
28    }
29}