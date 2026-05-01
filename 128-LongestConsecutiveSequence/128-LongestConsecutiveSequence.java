// Last updated: 01/05/2026, 12:15:12
1
2
3class Solution {
4    public int longestConsecutive(int[] nums) {
5        HashSet<Integer> set = new HashSet<>();
6
7        // Step 1: add all elements to set
8        for (int num : nums) {
9            set.add(num);
10        }
11
12        int maxLen = 0;
13
14        // Step 2: iterate through set
15        for (int num : set) {
16
17            // check if it's a starting point
18            if (!set.contains(num - 1)) {
19
20                int curr = num;
21                int len = 1;
22
23                // build sequence
24                while (set.contains(curr + 1)) {
25                    curr++;
26                    len++;
27                }
28
29                maxLen = Math.max(maxLen, len);
30            }
31        }
32
33        return maxLen;
34    }
35}