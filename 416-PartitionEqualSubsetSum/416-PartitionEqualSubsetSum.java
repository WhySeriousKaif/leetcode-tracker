// Last updated: 02/04/2026, 18:58:51
1class Solution {
2    public boolean canPartition(int[] arr) {
3        int n=arr.length;
4        int sum=0;
5        for(int i=0;i<n;i++ ){
6            sum+=arr[i];
7        }
8        if(sum%2!=0){
9            return false;
10        }
11        else{
12          return  subsetSum(arr,sum/2,n);
13        }
14    }
15     boolean subsetSum(int[] arr,int sum,int n){
16        boolean[][] t=new boolean[n+1][sum+1];
17        
18        for(int i=0;i<=n;i++){
19            t[i][0]=true;
20        }
21        
22        for(int i=1;i<=n;i++){
23            for(int j=1;j<=sum;j++){
24                if(arr[i-1]<=j){
25                    t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
26                }
27                else{
28                    t[i][j]=t[i-1][j];
29                }
30            }
31        }
32        return t[n][sum];
33    }
34}