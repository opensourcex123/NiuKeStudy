import java.util.ArrayList;

// JZ8 二叉树的下一个结点
public class GetNext {
    ArrayList<TreeLinkNode> res = new ArrayList<>();
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        TreeLinkNode root;
        root = pNode;
        while (root.next != null) {
            root = root.next;
        }
        inorder(root);

        for (int i = 0; i < res.size() - 1; i++) {
            if (pNode.val == res.get(i).val) {
                return res.get(i + 1);
            }
        }

        return null;
    }

    private void inorder(TreeLinkNode root) {
        if (root == null) return;
        inorder(root.left);
        res.add(root);
        inorder(root.right);
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}