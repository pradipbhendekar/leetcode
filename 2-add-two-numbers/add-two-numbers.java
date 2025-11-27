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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // here we are firstly calculate the access the data of a all nodes
        ListNode result=new ListNode(0);
        ListNode current=result;
       int remain=0;
    while(l1 != null || l2 != null || remain!=0){
       int x= (l1 != null) ? l1.val: 0; // give the value form a nodes
       int y= (l2 != null) ? l2.val : 0;
        int sum=x+y+remain;
        remain=sum/10;
    // we can insert the data into a result 
    current.next=new ListNode(sum%10);
    current=current.next;
    if(l1 !=null) l1=l1.next;
    if(l2 !=null) l2=l2.next;

    }
      return result.next;  
        
    }
}