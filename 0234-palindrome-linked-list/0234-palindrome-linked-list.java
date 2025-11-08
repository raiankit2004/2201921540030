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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;

        while(fast!=null &&  fast.next!=null){
            fast=fast.next.next;   //fast->2->1->null    // fast->null
            slow=slow.next;        //slow->2->2->1->null // slow->2->1->null
        }
        // now reverse the list
        ListNode prev=null;
        while(slow!=null){
            ListNode temp=slow.next; // temp=1->null  //temp=null
            slow.next=prev;          // 2->null       //1->2->null
            prev=slow;             //prev=2->null     //prev=1->2->null
            slow=temp;         // slow=1->null        //slow=null;
        }
        while(prev!=null){
            if(head.val!=prev.val)return false;
            head=head.next;
            prev=prev.next;
        }
                return true;
            
        
    }
}