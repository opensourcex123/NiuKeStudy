import java.util.ArrayList;

// JZ34 二叉树中和为某一值的路径(二)
public class FindPath {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int expectNumber) {
        ArrayList<Integer> trace = new ArrayList<>();
        backtrack(root, expectNumber, trace);
        return res;
    }

    private void backtrack(TreeNode root, int target, ArrayList<Integer> trace) {
        if (root == null) return;

        target -= root.val;
        trace.add(root.val);

        if (root.left == null && root.right == null && target == 0) {
            res.add(new ArrayList(trace));  // 新创建一块内存避免产生错误
        }

        backtrack(root.left, target, trace);
        backtrack(root.right, target, trace);
        trace.remove(trace.size() - 1);
    }
}
