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
// https://leetcode.com/problems/merge-two-sorted-lists/description/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(head1 !=null && head2 != null)
        {
            if(head1.val <= head2.val)
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else 
            {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null)
        {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null)
        {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return dummy.next;
    }
}