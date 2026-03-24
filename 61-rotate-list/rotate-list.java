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
    public ListNode rotateRight(ListNode head, int n) {
        if(head == null){
            return head;
        }
        if(head.next ==null){
            return head;
        }
         
        // here we are find the size of a Linkedlist
        ListNode current=head;
        int count=1;
        while(current.next != null){
            count++;
            current=current.next;
        }
         current=head;
       
         n=n%count;
        for(int i=0;i<n;i++){
            ListNode previous=null;
            while(current.next != null){
                previous=current;
                current=current.next;
            }
            current.next=head;
            head=current;
            previous.next=null;
        }
       
       return head;
     
    }
}