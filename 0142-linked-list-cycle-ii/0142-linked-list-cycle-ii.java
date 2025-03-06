/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         ListNode slow=head;
        ListNode fast=head;
        int length=0;
        while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           if(fast==slow){
             length=cyclelength(slow);
             break;
           }
        }
        if(length==0)return null;
        ListNode s=head;
        ListNode f=head;
        while(length>0){
            s=s.next;
            length--;
        }
        while(f!=s){
            f=f.next;
            s=s.next;
        } 
        return s;
    }

    int cyclelength(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        if(f==s){
          ListNode temp=s;
          int length=0;
          do{
            temp=temp.next;
            length++;
          }while(temp!=s);
          return length;
        }
    }
    return 0;
    }
}