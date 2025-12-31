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
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Boolean> map=new HashMap<>();
        // create one variable to store the head address 
        ListNode current=head;
        while(current!=null){
            if(map.containsKey(current.next)){
                return true;
            }
            current=current.next;
            map.put(current,true);
        }
        
        return false;

        }
    }
