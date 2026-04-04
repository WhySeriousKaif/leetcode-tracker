// Last updated: 04/04/2026, 11:48:08
1import java.util.*;
2
3class Solution {
4    public boolean canArrange(int[] arr, int k) {
5        // Map to store frequency of remainders
6        Map<Integer, Integer> remainderMap = new HashMap<>();
7
8        // Step 1: Fill remainder frequencies
9        for (int num : arr) {
10            int rem = num % k;
11            
12            // Handle negative remainder
13            if (rem < 0) rem += k;
14
15            remainderMap.put(rem, remainderMap.getOrDefault(rem, 0) + 1);
16        }
17
18        // Step 2: Check pairing condition
19        for (int rem : remainderMap.keySet()) {
20            int count = remainderMap.get(rem);
21
22            // Case 1: remainder 0 → must be even
23            if (rem == 0) {
24                if (count % 2 != 0) return false;
25            } 
26            else {
27                int complement = k - rem;
28
29                // If complement not present OR counts mismatch → invalid
30                if (remainderMap.getOrDefault(complement, 0) != count) {
31                    return false;
32                }
33            }
34        }
35
36        return true;
37    }
38}