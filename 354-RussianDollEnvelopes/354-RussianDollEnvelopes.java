// Last updated: 14/04/2026, 19:32:53
1class Solution {
2    public int maxEnvelopes(int[][] A) {
3        
4        Arrays.sort(A, (a, b) -> {
5            if (a[0] == b[0]) return b[1] - a[1];
6            return a[0] - b[0];
7        });
8
9        ArrayList<Integer> lis = new ArrayList<>();
10
11        for (int[] env : A) {
12            int h = env[1];
13
14            int idx = Collections.binarySearch(lis, h);
15
16            if (idx < 0) idx = -(idx + 1);
17
18            if (idx == lis.size()) {
19                lis.add(h);
20            } else {
21                lis.set(idx, h);
22            }
23        }
24
25        return lis.size();
26    }
27}