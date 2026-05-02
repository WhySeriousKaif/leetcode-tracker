// Last updated: 02/05/2026, 11:15:37
1class Solution {
2    public boolean isPalindrome(String s) {
3        int n=s.length();
4
5       int i=0;
6       int j=n-1;
7       while(i<j){
8         while(i<j &&!Character.isLetterOrDigit(s.charAt(i))) i++;
9         while(i<j && !Character.isLetterOrDigit(s.charAt(j)))  j--;
10
11         if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))) return false;
12         i++;
13         j--;
14
15       }
16       return true;
17        
18    }
19}