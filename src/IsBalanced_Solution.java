// JZ79 判断是不是平衡二叉树
public class IsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;

        int left = Height(root.left);
        int right = Height(root.right);
        if (Math.abs(left - right) > 1) {
            return false;
        }

        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    private int Height(TreeNode root) {
        if (root == null) return 0;
        int left = Height(root.left);
        int right = Height(root.right);
        return Math.max(left, right) + 1;
    }
}
