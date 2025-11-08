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
 // https://leetcode.com/problems/palindrome-linked-list/description/
 class Solution {

    public ListNode middleOflist(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } 
        return prev;
    }
    public boolean isPalindrome(ListNode head) {

        // Find the Mid in the linked list 
        ListNode left = head;
        ListNode mid = middleOflist(head);
        ListNode right = reverseList(mid);
        
        while(right!=null)
        {
            if(left.val != right.val)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}