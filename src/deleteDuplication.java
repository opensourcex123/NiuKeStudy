// JZ76 删除链表中重复的结点
public class deleteDuplication {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = pHead;
        ListNode slow = new ListNode(-1);
        ListNode fast = new ListNode(-1);
        slow = dummy;
        fast = pHead;

        while (fast != null) {
            while (fast.next != null && (fast.val == fast.next.val)) {
                fast = fast.next;
            }

            if (slow.next != fast) {
                slow.next = fast.next;
                fast = slow.next;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }

        // head在某些边界情况下会改变，所以不能返回head
        return dummy.next;
    }
}
