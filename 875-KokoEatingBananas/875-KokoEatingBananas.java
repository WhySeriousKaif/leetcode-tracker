// Last updated: 19/07/2026, 12:35:56
1class Solution {
2    boolean canEatBananas(int[] piles,int mid,int h){
3        int actualHour=0;
4        for(int x: piles){
5            actualHour+=x/mid;
6            if(x%mid!=0){
7                actualHour++;
8            }
9        }
10        return actualHour<=h;
11    }
12    public int minEatingSpeed(int[] piles, int h) {
13        int l=1;
14        int r=0;
15        int max=piles[0];
16        for(int i=0;i<piles.length;i++){
17            if(max<piles[i]) max=piles[i];
18
19        }
20        r=max;
21       while(l<r){
22        int mid=l+(r-l)/2;
23          if(canEatBananas(piles,mid,h)){
24             r=mid;
25
26          }
27          else{
28            l=mid+1;
29          }
30       }
31       return r;
32        
33    }
34}