// Last updated: 25/07/2026, 17:05:47
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        
4        int n = nums2.length;
5         int m = nums1.length;
6        int size = m + n;
7
8        int idx1 = (size / 2) - 1;
9        int element1 = -1;
10        int idx2 = size / 2;
11        int element2 = -1;
12
13        int i = 0, j = 0, k = 0;
14
15        while (i < m && j < n) {
16            if (nums1[i] < nums2[j]) {
17                if (k == idx1) {
18                    element1 = nums1[i];
19                }
20                if (k == idx2) {
21                    element2 = nums1[i];
22                }
23                i++;
24            } else {
25                if (k == idx1) {
26                    element1 = nums2[j];
27                }
28                if (k == idx2) {
29                    element2 = nums2[j];
30                }
31                j++;
32            }
33            k++;
34        }
35
36        while (i < m) {
37            if (k == idx1) {
38                element1 = nums1[i];
39            }
40            if (k == idx2) {
41                element2 = nums1[i];
42            }
43            i++;
44            k++;
45        }
46
47        while (j < n) {
48            if (k == idx1) {
49                element1 = nums2[j];
50            }
51            if (k == idx2) {
52                element2 = nums2[j];
53            }
54            j++;
55            k++;
56        }
57
58        if (size % 2 == 1)
59            return element2;
60
61        return (element1 + element2) / 2.0;
62    }
63}