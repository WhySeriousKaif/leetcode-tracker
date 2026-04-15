// Last updated: 15/04/2026, 18:07:51
1class Solution {
2    public long countPairs(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        long ans = 0;
5
6        for (int num : nums) {
7            int g = gcd(num, k);
8
9            for (int prevG : map.keySet()) {
10                if ((long) g * prevG % k == 0) {
11                    ans += map.get(prevG);
12                }
13            }
14
15            map.put(g, map.getOrDefault(g, 0) + 1);
16        }
17
18        return ans;
19    }
20
21    private int gcd(int a, int b) {
22        return b == 0 ? a : gcd(b, a % b);
23    }
24}