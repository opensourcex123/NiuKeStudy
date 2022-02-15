// JZ68 二叉搜索树的最近公共祖先
public class lowestCommonAncestorII {
    public int lowestCommonAncestor (TreeNode root, int p, int q) {
        // write code here
        if (root == null) return -1;
        if (root.val == p || root.val == q) return root.val;

        // 利用二叉搜索树的性质
        if (p < root.val && q < root.val) return lowestCommonAncestor(root.left, p, q);
        else if (p > root.val && q > root.val) return lowestCommonAncestor(root.right, p, q);
        else return root.val;
    }
}
