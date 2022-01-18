import java.util.ArrayList;

 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


// JZ6 从尾到头打印链表
public class printListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> res = new ArrayList<>();
        ListNode node = reverse(listNode);
        while (node != null) {
            res.add(node.val);
            node = node.next;
        }
        return res;
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
