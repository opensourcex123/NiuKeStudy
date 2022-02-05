// JZ82 二叉树中和为某一值的路径(一)
public class hasPathSum {
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        if (root == null) return false;
        return backtrack(root, sum);
    }

    private boolean backtrack(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        sum -= root.val;

        if (root.left == null && root.right == null && sum == 0) {
            return true;
        }


        return backtrack(root.left, sum) || backtrack(root.right, sum);
    }
}
