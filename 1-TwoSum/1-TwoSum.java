// Last updated: 02/05/2026, 12:05:33
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        if (nums.length < 3) {
4            return new ArrayList<>();
5        }
6
7        List<List<Integer>> result = new ArrayList<>();
8        Arrays.sort(nums);
9
10        for (int i = 0; i < nums.length - 2; i++) {
11            if (i != 0 && nums[i] == nums[i - 1]) {
12                continue;
13            }
14            twoSum(nums, i + 1, result, -nums[i]);
15        }
16
17        return result;
18    }
19
20    private void twoSum(int[] nums, int k, List<List<Integer>> result, int target) {
21        int i = k, j = nums.length - 1;
22
23        while (i < j) {
24            if (nums[i] + nums[j] > target) {
25                j--;
26            } else if (nums[i] + nums[j] < target) {
27                i++;
28            } else {
29                result.add(Arrays.asList(-target, nums[i], nums[j]));
30
31                while (i < j && nums[i] == nums[i + 1]) {
32                    i++;
33                }
34                while (i < j && nums[j] == nums[j - 1]) {
35                    j--;
36                }
37
38                i++;
39                j--;
40            }
41        }
42    }
43}