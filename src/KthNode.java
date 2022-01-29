import java.util.ArrayList;

// JZ54 二叉搜索树的第k个节点
public class KthNode {
    ArrayList<Integer> res = new ArrayList<>();
    public int KthNode (TreeNode proot, int k) {
        // write code here
        if (proot == null || k == 0) return -1;
        Inorder(proot);
        if (k > res.size()) return -1;
        return res.get(k - 1);
    }

    private void Inorder(TreeNode root) {
        if (root == null) return ;
        Inorder(root.left);
        res.add(root.val);
        Inorder(root.right);
    }
}
