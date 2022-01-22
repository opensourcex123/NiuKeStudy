// JZ23 链表中环的入口结点
public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode sl = pHead;
        ListNode fa = pHead;
        while (fa != null && fa.next != null) {
            sl = sl.next;
            fa = fa.next.next;
            if (sl == fa) break;
        }
        if (fa == null || fa.next == null) return null;
        sl = pHead;
        while (sl != fa) {
            sl = sl.next;
            fa = fa.next;
        }
        return sl;
    }
}
