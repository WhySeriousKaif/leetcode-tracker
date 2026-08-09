// Last updated: 09/08/2026, 10:16:05
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public void reorderList(ListNode head) {
13        Stack<ListNode>st=new Stack<>();
14        ListNode temp=head;
15        while(temp!=null){
16            st.add(temp);
17            temp=temp.next;
18        }
19        int k=st.size()/2;
20        ListNode curr=head;
21        while(k>0){
22            ListNode newNode=st.pop();
23            ListNode tempCurr=curr.next;
24            curr.next=newNode;
25            newNode.next=tempCurr;
26            curr=tempCurr;
27            k--;
28        }
29        curr.next=null;
30
31
32        
33    }
34}