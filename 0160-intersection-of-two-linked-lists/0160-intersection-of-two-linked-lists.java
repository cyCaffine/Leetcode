/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        // Get the lengths of both linked lists
        int lengthA = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }
        
        int lengthB = 0;
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }
        
        // Reset tempA and tempB to the start of their respective lists
        tempA = headA;
        tempB = headB;
        
        // Equalize the lengths by advancing the pointer of the longer list
        if (lengthA > lengthB) {
            int step1 = lengthA - lengthB;
            for (int i = 0; i < step1; i++) {
                tempA = tempA.next;
            }
        } else {
            int step2 = lengthB - lengthA;
            for (int i = 0; i < step2; i++) {
                tempB = tempB.next;
            }
        }
        
        // Find the intersection node
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        
        return tempA; // This will be null if there is no intersection
    }
}
