import java.util.LinkedList;

// JZ37 序列化二叉树
public class Serialize {
    String SEQ = ",";
    String NULL = "#";
    StringBuilder sb = new StringBuilder();

    String Serialize(TreeNode root) {
        if (root == null) return sb.append(NULL).append(SEQ).toString();
        sb.append(root.val).append(SEQ);
        Serialize(root.left);
        Serialize(root.right);
        return sb.toString();
    }

    TreeNode Deserialize(String str) {
        LinkedList<String> nodes = new LinkedList<>();
        for (String s : str.split(SEQ)) {
            nodes.addLast(s);
        }
        return deserialize(nodes);
    }

    private TreeNode deserialize(LinkedList<String> nodes) {
        if (nodes.isEmpty()) return null;

        String first = nodes.removeFirst();
        if (first.equals(NULL)) return null;
        TreeNode root = new TreeNode(Integer.parseInt(first));
        root.left = deserialize(nodes);
        root.right = deserialize(nodes);
        return root;
    }
}
