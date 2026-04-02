// Last updated: 02/04/2026, 12:41:05
1class Solution {
2    public int longestPalindrome(String s) {
3        int[] freq = new int[128]; // ASCII
4        
5        // count frequency
6        for (char c : s.toCharArray()) {
7            freq[c]++;
8        }
9        
10        int length = 0;
11        boolean hasOdd = false;
12        
13        for (int count : freq) {
14            if (count % 2 == 0) {
15                length += count;
16            } else {
17                length += count - 1;
18                hasOdd = true;
19            }
20        }
21        
22        if (hasOdd) length += 1;
23        
24        return length;
25    }
26}