// JZ7 重建二叉树
public class reConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] vin) {
        return build(pre, 0, pre.length - 1, vin, 0, vin.length - 1);
    }

    private TreeNode build(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd) return null;
        int rootVal = pre[preStart];
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (rootVal == in[i]) {
                index = i;
                break;
            }
        }
        int leftSize = index - inStart;
        TreeNode root = new TreeNode(rootVal);
        root.left = build(pre, preStart + 1, preStart + leftSize, in, inStart, index - 1);
        root.right = build(pre, preStart + leftSize + 1, preEnd, in, index + 1, inEnd);
        return root;
    }
}
