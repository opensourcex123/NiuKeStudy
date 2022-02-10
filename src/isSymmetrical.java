// JZ28 对称的二叉树
public class isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot) {
        return isSame(pRoot, pRoot);
    }

    private boolean isSame(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;

        if (root1.val != root2.val) {
            return false;
        } else {
            return isSame(root1.left, root2.right) && isSame(root1.right, root2.left);
        }
    }
}
