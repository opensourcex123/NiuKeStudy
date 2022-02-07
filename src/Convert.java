// JZ36 二叉搜索树与双向链表
public class Convert {
    TreeNode preNode;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;

        TreeNode p = pRootOfTree;
        while (p.left != null) {
            p = p.left;
        }
        inorder(pRootOfTree);
        return p;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        root.left = preNode;
        if (preNode != null) {
            preNode.right = root;
        }
        preNode = root;

        inorder(root.right);
    }
}
