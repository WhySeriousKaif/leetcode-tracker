// Last updated: 12/09/2026, 12:37:02
1class Solution {
2    public List<Integer> spiralOrder(int[][] A) {
3        
4        List<Integer> ans = new ArrayList<>();
5
6        int rowBegin = 0;
7        int rowEnd = A.length - 1;
8        int colBegin = 0;
9        int colEnd = A[0].length - 1;
10
11        while (rowBegin <= rowEnd && colBegin <= colEnd) {
12
13            // Traverse Right
14            for (int j = colBegin; j <= colEnd; j++) {
15                ans.add(A[rowBegin][j]);
16            }
17            rowBegin++;
18
19            // Traverse Down
20            for (int i = rowBegin; i <= rowEnd; i++) {
21                ans.add(A[i][colEnd]);
22            }
23            colEnd--;
24
25            // Traverse Left
26            if (rowBegin <= rowEnd) {
27                for (int j = colEnd; j >= colBegin; j--) {
28                    ans.add(A[rowEnd][j]);
29                }
30                rowEnd--;
31            }
32
33            // Traverse Up
34            if (colBegin <= colEnd) {
35                for (int i = rowEnd; i >= rowBegin; i--) {
36                    ans.add(A[i][colBegin]);
37                }
38                colBegin++;
39            }
40        }
41
42        return ans;
43    }
44}