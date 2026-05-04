// Last updated: 04/05/2026, 10:48:48
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        if(s.length()==0) return 0;
4        int maxLength=1;
5        for(int i=0;i<s.length();i++){
6            int len=1;
7            HashSet<Character>set=new HashSet<>();
8            set.add(s.charAt(i));
9            for(int j=i+1;j<s.length();j++){
10                if(!set.contains(s.charAt(j))){
11                    set.add(s.charAt(j));
12                    len++;
13                    maxLength=Math.max(maxLength,len);
14                }
15                else{
16                    break;
17                }
18
19
20
21            }
22        }
23        return maxLength;
24        
25    }
26}
27