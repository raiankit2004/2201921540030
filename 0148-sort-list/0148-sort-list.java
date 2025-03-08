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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
           ListNode prev=null;
           ListNode slow=head;
           ListNode fast=head;
           while(fast!=null && fast.next!=null){
              prev=slow;
              slow=slow.next;
              fast=fast.next.next;
           }
           if(prev!=null) prev.next=null;
            
            ListNode left=sortList(head); 
            ListNode right=sortList(slow);
            ListNode merge=merge(left,right);
            return merge;
      }
     public static ListNode merge(ListNode left,ListNode right){
         ListNode dummy = new ListNode(-1);
         ListNode temp=dummy;
         while(left!=null && right!=null){
            if(left.val<=right.val){
                temp.next=left;
                left=left.next;
            }
            else if(left.val>right.val){
            temp.next=right;
            right=right.next;
            }
            temp=temp.next;
         }
         temp.next = (left != null) ? left : right;
      return dummy.next;
    }
}