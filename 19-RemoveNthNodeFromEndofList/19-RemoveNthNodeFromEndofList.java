// Last updated: 09/08/2026, 11:03:34
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
15        int len=0;
16        ListNode temp=head;
17        while(temp!=null){
18            len++;
19            temp=temp.next;
20        }
21        if(n>len) return head;
22        if(n==len) return head.next;
23        int trav_front=len-n;
24        ListNode prev=null;
25        temp=head;
26        while(trav_front-->0){
27            prev=temp;
28            temp=temp.next;
29
30
31        }
32        prev.next=temp.next;
33        temp.next=null;
34        return head;
35
36    }
37    
38}
39