import java.util.Stack;

// JZ9 用两个栈实现队列
public class QueueByStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack2.push(node);
    }

    public int pop() {
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                int node = stack2.pop();
                stack1.push(node);
            }
        }

        return stack1.pop();
    }
}
