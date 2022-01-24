import java.util.HashMap;

// JZ35 复杂链表的复制
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class RandomListNodeClone {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;
        RandomListNode dummy = new RandomListNode(0);
        HashMap<RandomListNode, RandomListNode> hm = new HashMap<>();
        RandomListNode pre = dummy;
        RandomListNode cur = pHead;
        while (cur != null) {
            RandomListNode clone = new RandomListNode(cur.label);
            pre.next = clone;
            hm.put(cur, clone);
            cur = cur.next;
            pre = pre.next;
        }

        for (RandomListNode key : hm.keySet()) {
            // 要用哈希表去映射指针，不能指向原链表
            hm.get(key).random = hm.get(key.random) == null ? null : hm.get(key.random);
        }

        return hm.get(pHead);
    }
}
