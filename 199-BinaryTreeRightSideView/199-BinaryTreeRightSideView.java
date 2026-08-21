// Last updated: 21/08/2026, 10:42:12
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> rightSideView(TreeNode root) {
18        if(root==null) return new ArrayList<>(0);
19        Queue<TreeNode> q=new LinkedList<>();
20        List<Integer>ans=new ArrayList<>();
21        q.add(root);
22        while(!q.isEmpty()){
23            int n=q.size();
24            TreeNode node=null;
25            while(n-->0){
26                node=q.poll();
27                if(node.left!=null) q.add(node.left);
28                if(node.right!=null) q.add(node.right);
29
30
31            }
32            ans.add(node.val);
33
34        }
35        return ans;
36        
37    }
38}