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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        if(head==null)return head;
        if(head.next==null)return head;
        while(temp!=null && temp.next!=null){
            int t=temp.val;
            temp.val=temp.next.val;
            temp.next.val=t;

            temp=temp.next.next;
        }
        return head;
    }
}