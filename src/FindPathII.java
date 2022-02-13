// JZ84 二叉树中和为某一值的路径(三)
public class FindPathII {
    int res = 0;
    public int FindPath (TreeNode root, int sum) {
        // write code here
        if (root == null) return 0;
        traverse(root, sum);
        FindPath(root.left, sum);
        FindPath(root.right, sum);
        return res;
    }

    private void traverse(TreeNode root, int target) {
        if (root == null) return;

        target -= root.val;
        if (target == 0) {
            res++;
        }

        traverse(root.left, target);
        traverse(root.right, target);
    }
}
