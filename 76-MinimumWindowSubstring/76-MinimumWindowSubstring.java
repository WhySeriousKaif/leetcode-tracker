// Last updated: 15/04/2026, 20:22:11
1class Solution {
2    public String minWindow(String s, String t) {
3        HashMap<Character, Integer> freqMap = new HashMap<>();
4
5        // Step 1: Build frequency map of t
6        for (int i = 0; i < t.length(); i++) {
7            char ch = t.charAt(i);
8            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
9        }
10
11        int uniqueCharCount = freqMap.size(); // number of chars to satisfy
12        int windowStart = 0, windowEnd = 0;
13        int startIndex = -1;
14        int minLen = Integer.MAX_VALUE;
15
16        while (windowEnd < s.length()) {
17
18            // 🔹 Expand window
19            char ch = s.charAt(windowEnd);
20            if (freqMap.containsKey(ch)) {
21                freqMap.put(ch, freqMap.get(ch) - 1);
22                if (freqMap.get(ch) == 0) {
23                    uniqueCharCount--;
24                }
25            }
26
27            // 🔹 Shrink window
28            while (uniqueCharCount == 0) {
29                int len = windowEnd - windowStart + 1;
30
31                if (len < minLen) {
32                    minLen = len;
33                    startIndex = windowStart;
34                }
35
36                char startChar = s.charAt(windowStart);
37                if (freqMap.containsKey(startChar)) {
38                    freqMap.put(startChar, freqMap.get(startChar) + 1);
39                    if (freqMap.get(startChar) > 0) {
40                        uniqueCharCount++;
41                    }
42                }
43
44                windowStart++;
45            }
46
47            windowEnd++;
48        }
49
50        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLen);
51    }
52}