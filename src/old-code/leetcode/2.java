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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode ptr = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            // if null then use it as 0
            int x = (l1 != null) ? l1.val : 0;
            // if null then use it as 0
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            ptr.next = new ListNode(sum % 10);
            ptr = ptr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // in the end if carry is there then put it in the last index
        if (carry > 0) {
            ptr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

}