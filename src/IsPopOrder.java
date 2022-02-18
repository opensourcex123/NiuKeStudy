import java.util.Stack;

// JZ31 栈的压入、弹出序列
public class IsPopOrder {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        // 模拟法
        Stack<Integer> s = new Stack<>();
        int i = 0;
        int j = 0;
        while (i < pushA.length && j < popA.length) {
            if (pushA[i] != popA[j]) {
                s.push(pushA[i]);
                i++;
            } else {
                i++;
                j++;
                while (!s.isEmpty() && popA[j] == s.peek()) {
                    s.pop();
                    j++;
                }
            }
        }

        return s.isEmpty();
    }
}
