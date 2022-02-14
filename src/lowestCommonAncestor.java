// JZ86 在二叉树中找到两个节点的最近公共祖先
public class lowestCommonAncestor {
    public int lowestCommonAncestor(TreeNode root, int o1, int o2) {
        // write code here
        if (root == null) return 0;
        if (root.val == o1 || root.val == o2) return root.val;

        int left = lowestCommonAncestor(root.left, o1, o2);
        int right = lowestCommonAncestor(root.right, o1, o2);
        if (left != 0 && right != 0) {
            return root.val;
        }

        if (left == 0 && right == 0) {
            return 0;
        }

        return left == 0 ? right : left;
    }
}
