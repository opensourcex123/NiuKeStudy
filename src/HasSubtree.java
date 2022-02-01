// JZ26 树的子结构
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root2 == null) return false;
        if (root1 == null) return false;

        return traverse(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    private boolean traverse(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        else if (root1 == null) return false;
        else if (root1.val != root2.val) return false;
        return traverse(root1.left, root2.left) && traverse(root1.right, root2.right);
    }
}
