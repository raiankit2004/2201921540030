/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode curr=head;
        ListNode slow=head.next;
        ListNode fast=head.next;
        while(slow!=null && slow.next!=null){
               curr.next=slow.next;
               curr=curr.next;
               slow.next=curr.next;
               slow=slow.next;
               
        }
        curr.next=fast;
        return head;
    }
}