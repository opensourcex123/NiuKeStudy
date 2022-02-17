import java.util.Stack;

// JZ30 包含min函数的栈
public class minStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> s = new Stack();
    Stack<Integer> minStack = new Stack();

    public void push(int node) {
        if (node <= min) {
            min = node;
            minStack.push(min);
        } else {
            minStack.push(minStack.peek());
        }
        s.push(node);
    }

    public void pop() {
        s.pop();
        minStack.pop();
    }

    public int top() {
        return s.peek();
    }

    public int min() {
        return minStack.peek();
    }
}