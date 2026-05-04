// Last updated: 04/05/2026, 12:38:16
1import java.util.HashMap;
2
3public class Solution {
4    public int lengthOfLongestSubstring(String s) {
5        HashMap<Character, Integer> map = new HashMap<>();
6        int maxLen = 0;
7        int i = 0;
8        
9        for (int j = 0; j < s.length(); j++) {
10            // Add current character to map
11            if (map.containsKey(s.charAt(j))) {
12                map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
13            } else {
14                map.put(s.charAt(j), 1);
15            }
16            
17            // CORE CONDITION: map.size() == window size (j - i + 1)
18            // This means ALL characters in window are unique
19            while (map.size() < j - i + 1) {
20                char leftChar = s.charAt(i);
21                map.put(leftChar, map.get(leftChar) - 1);
22                if (map.get(leftChar) == 0) {
23                    map.remove(leftChar);
24                }
25                i++;
26            }
27            
28            // Update maximum length when condition == (all unique chars)
29            maxLen = Math.max(maxLen, j - i + 1);
30        }
31        
32        return maxLen;
33    }
34}