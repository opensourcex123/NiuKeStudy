import java.util.ArrayList;
import java.util.LinkedList;

// JZ59 滑动窗口的最大值
// 单调队列
class MonotonousQueue {
    LinkedList<Integer> q = new LinkedList<>();

    public void push(int n) {
        while (!q.isEmpty() && q.getLast() < n) {
            q.pollLast();
        }

        q.addLast(n);
    }

    public int max() {
        return q.getFirst();
    }

    public void pop(int n) {
        if (n == q.getFirst()) {
            q.pollFirst();
        }
    }
}

public class maxInWindows {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        MonotonousQueue window = new MonotonousQueue();
        ArrayList<Integer> res = new ArrayList<>();
        if (size == 0) {
            return res;
        }

        for (int i = 0; i < num.length; i++) {
            if (i < size - 1) {
                window.push(num[i]);
            } else {
                window.push(num[i]);
                res.add(window.max());
                window.pop(num[i - size + 1]);
            }
        }

        return res;
    }
}
