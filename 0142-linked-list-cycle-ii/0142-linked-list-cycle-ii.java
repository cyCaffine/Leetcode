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
        if(head == null)return null;
        if(head.next == null)return null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null){
            if(slow == null)return null;
            slow = slow.next;
            if(fast.next == null)return null;
            fast = fast.next.next;
            if(fast == slow)
            break;
        }

        ListNode temp = head;
        while(temp != slow){
            if(temp == null)return null;
            temp = temp.next;
            if(slow == null)return null;
            slow = slow.next;
   if(temp == slow){
    return slow;
   }
        }
        return slow;
        
    }
}