// Last updated: 09/08/2026, 11:11:23
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
11
12class Solution {
13    public ListNode removeNthFromEnd(ListNode head, int n) {
14
15       ListNode temp=head;
16       while(n-->0){
17        temp=temp.next;
18       }
19       if(temp==null) return head.next;
20       ListNode prev=head;
21       while(temp!=null&& temp.next!=null){
22         temp=temp.next;
23         prev=prev.next;
24       }
25       ListNode del=prev.next;
26       prev.next=del.next;
27       del.next=null;
28       return head;
29
30    }
31    
32}
33