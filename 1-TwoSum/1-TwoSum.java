// Last updated: 02/05/2026, 11:34:28
1public class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> res = new ArrayList<>();
5
6        for (int i = 0; i < nums.length; i++) {
7            if (nums[i] > 0) break;
8            if (i > 0 && nums[i] == nums[i - 1]) continue;
9
10            int l = i + 1, r = nums.length - 1;
11            while (l < r) {
12                int sum = nums[i] + nums[l] + nums[r];
13                if (sum > 0) {
14                    r--;
15                } else if (sum < 0) {
16                    l++;
17                } else {
18                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
19                    l++;
20                    r--;
21                    while (l < r && nums[l] == nums[l - 1]) {
22                        l++;
23                    }
24                }
25            }
26        }
27        return res;
28    }
29}