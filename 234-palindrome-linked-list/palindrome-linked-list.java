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
        //solve this question using a recursion 
        //base case
        Stack<Integer> stack=new Stack<>();
        ListNode current=head;
        while(current!=null){
            stack.push(current.val);
            current=current.next;
        }

        while(head!=null){
            int number=stack.pop();
            if(number != head.val) return false;
            head=head.next;
        }
        return true;
        
    }
}