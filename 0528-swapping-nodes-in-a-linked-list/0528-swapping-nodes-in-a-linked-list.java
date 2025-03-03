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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode mark=head;
        ListNode prev=head;
        for( int i=0;i<k-1;i++){
            fast=fast.next;
        }
          mark=fast;
          while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
          } 
           prev=slow;

            int x = prev.val;
            prev.val=mark.val;
            mark.val =x;

      return head;

    }
}