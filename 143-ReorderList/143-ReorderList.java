// Last updated: 09/08/2026, 10:08:18
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
13    public void reorderList(ListNode head) {
14        ListNode slow=head;
15        ListNode fast=head;
16        while(fast!=null && fast.next!=null){
17            slow=slow.next;
18            fast=fast.next.next;
19        }
20        ListNode mid=slow;
21        ListNode rev=reverseList(mid);
22        ListNode curr=head;
23        while(rev.next!=null){
24
25            ListNode tempCurr=curr.next;
26            curr.next=rev;
27            ListNode tempRev=rev.next;
28            rev.next=tempCurr;
29            curr=tempCurr;
30            rev=tempRev;
31
32        }
33
34        
35    }
36    public static ListNode reverseList(ListNode head){
37        if(head==null || head.next==null){
38            return head;
39        }
40        ListNode last=reverseList(head.next);
41        head.next.next=head;
42        head.next=null;
43        return last;
44    }
45}
46