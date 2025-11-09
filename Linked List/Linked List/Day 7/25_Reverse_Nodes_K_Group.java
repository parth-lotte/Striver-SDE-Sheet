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
 // https://leetcode.com/problems/reverse-nodes-in-k-group/description/
 class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode dummy = head;

        for(int i = 0; i< k; i++)
        {
            if(dummy != null)
            {
                dummy = dummy.next;
            }else
            {
                return head;
            }
        }

        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;

        for(int i = 0; i< k; i++)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head.next = reverseKGroup(curr, k);
        return prev;
    }
}