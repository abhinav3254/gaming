class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode node = new ListNode(Integer.MAX_VALUE);
        ListNode temp = node;

        while (head != null) {
            if (temp.val != head.val) {
                temp.next = new ListNode(head.val);
                temp = temp.next;
            }
            head = head.next;
        }

        return node.next;
        
    }
}