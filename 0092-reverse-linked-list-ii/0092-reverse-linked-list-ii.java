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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr=head;
        ListNode prev=null;
        int i=1;
        while(curr!=null && i!=left){
            prev=curr;
            curr=curr.next;
            i++;
        }
        ListNode pts = prev;
        ListNode start = curr;
        prev=null;
        while(curr!=null && i!=right+1){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            i++;
        }  
        start.next=curr;
        if(pts!=null){
            pts.next=prev;
        }
         else {
            return prev;
         }
        return head;
    }
}