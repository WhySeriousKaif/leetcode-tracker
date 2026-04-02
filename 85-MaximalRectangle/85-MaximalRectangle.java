// Last updated: 03/04/2026, 00:19:27
1import java.util.*;
2
3class Solution {
4
5    public int maximalRectangle(char[][] matrix) {
6
7        if (matrix == null || matrix.length == 0) return 0;
8
9        int n = matrix.length;
10        int m = matrix[0].length;
11
12        int[] height = new int[m];
13        int maxArea = 0;
14
15        for (int i = 0; i < n; i++) {
16
17            // Build histogram
18            for (int j = 0; j < m; j++) {
19                if (matrix[i][j] == '1') {
20                    height[j] += 1;
21                } else {
22                    height[j] = 0;
23                }
24            }
25
26            // Apply largest rectangle in histogram
27            maxArea = Math.max(maxArea, largestRectangleArea(height));
28        }
29
30        return maxArea;
31    }
32
33    // Same helper from previous problem
34    private int largestRectangleArea(int[] histo) {
35        Stack<Integer> st = new Stack<>();
36        int maxA = 0;
37        int n = histo.length;
38
39        for (int i = 0; i <= n; i++) {
40
41            while (!st.isEmpty() && (i == n || histo[st.peek()] >= histo[i])) {
42
43                int height = histo[st.peek()];
44                st.pop();
45
46                int width;
47                if (st.isEmpty()) {
48                    width = i;
49                } else {
50                    width = i - st.peek() - 1;
51                }
52
53                maxA = Math.max(maxA, height * width);
54            }
55
56            st.push(i);
57        }
58
59        return maxA;
60    }
61}