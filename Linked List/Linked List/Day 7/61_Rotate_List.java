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

 // https://leetcode.com/problems/rotate-list/description/
 class Solution {

    public int length(ListNode head)
    {

        if( head == null)
        {
            return 0;
        }
        int size = 0;
        ListNode temp = head;

        while(temp!= null)
        {
            size++;
            temp = temp.next;
        }
        return size;
    }
    public ListNode rotateRight(ListNode head, int k) {

        if( head == null)
        {
            return null;
        }
        k = k % length(head);  // If value overflows then we can adjust 

        ListNode slow = head;
        ListNode fast = head;

        while(k -->0)
        {
            fast = fast.next;
        }

        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}