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
 // https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {


        int len = 0;

        ListNode temp = head;

        if(head == null)
        {
            return null;
        }

        while(temp != null)
        {
            len++;
            temp = temp.next;
        }
  if(len==n)
        {
           head=head.next;
           return head;
        }
        int idx = 1;
        int range = len - n;

        ListNode prev = head;
        while(idx <range)
        {
            prev = prev.next;
            idx++;
        }

        prev.next = prev.next.next;
        return head;
    }
}