// JZ18 删除链表的节点
public class deleteNode {
    public ListNode deleteNode (ListNode head, int val) {
        // write code here
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;
        while (fast != null) {
            if (fast.val != val) {
                slow = slow.next;
                fast = fast.next;
            } else {
                slow.next = fast.next;
                fast = fast.next;
                break;
            }
        }
        return dummy.next;
    }
}
