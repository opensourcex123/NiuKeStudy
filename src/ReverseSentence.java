import java.util.Stack;

// JZ73 翻转单词序列
public class ReverseSentence {
    public String ReverseSentence(String str) {
        Stack<String> stack = new Stack<>();
        String[] splitS = str.split(" ");

        for (int i = 0; i < splitS.length; i++) {
            stack.push(splitS[i]);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            if (!stack.isEmpty()) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
