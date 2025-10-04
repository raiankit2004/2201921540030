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
    public ListNode rotateRight(ListNode head, int k) {
       if(head==null ||k==0) return head;
        ListNode tail=head;
        ListNode first=head;
        int n=1;
        
            while(tail.next!=null){      //find the tail
                tail=tail.next;  // tail at 5
                n++; // length; n=5;
            }
            k=k%n ; //when k>n so make it less; 2<5
            
            if(k==0)return head; //k=2

            int diff=n-k-1;  // 5-2-1=2;
            while(first!=null && diff>0){ //diff 2>0 //1>0 
                diff--;  //diff=1;  diff=0;
                 first=first.next;  // first at 1->2 // 1->2->3
            }
              ListNode nextNode = first.next; // nextNode= 4
              first.next=null;     // 3->null
              tail.next=head;     // 5->1
              
        return nextNode;
    }
}