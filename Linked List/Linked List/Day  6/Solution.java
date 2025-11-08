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
// https://leetcode.com/problems/linked-list-cycle-ii/
public class Solution {
    public ListNode detectCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode ans = null;

        while(head != null)
        {
            if(set.contains(head))
            {
                ans = head;
                return ans;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
}