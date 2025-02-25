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
    public ListNode removeElements(ListNode head, int val) {
        
      
        if(head==null){
            return head;
        }
        ListNode start = head;
        ListNode prev = null;
        while(start!=null){ 
            if(start!=null && start.val==val){
            while( start!=null &&start.val==val){
            start=start.next;
        }
        if(prev!=null)
        prev.next = start;
        else
        head = start;
            }
            else{
            prev = start;
            start=start.next;
            }
        }
            return head;
    }
}