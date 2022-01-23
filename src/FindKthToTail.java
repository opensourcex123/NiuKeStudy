// JZ22 链表中倒数最后k个结点
public class FindKthToTail {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if (pHead == null || k == 0) return null;
        ListNode p1 = pHead;
        for (int i = 0; i < k; i++) {
            if (p1 == null) return null;    // 首先判空，然后往下走
            p1 = p1.next;
        }
        ListNode p2 = pHead;
        while (p1 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        return p2;
    }
}
