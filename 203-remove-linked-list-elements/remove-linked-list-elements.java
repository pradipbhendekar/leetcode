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
        // here we are skip first element
        while(  head!=null && head.val==val ){
            head=head.next;
        }

        // here we are remove the element of a linkedlist
        ListNode current=head;
       while(current != null && current.next != null ){
            if(current.next.val == val){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
       }
        return head;

    }
}