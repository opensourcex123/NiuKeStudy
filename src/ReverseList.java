// JZ24 反转链表
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode last = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
