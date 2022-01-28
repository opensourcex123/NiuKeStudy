import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

// JZ77 按之字形顺序打印二叉树
public class Print {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) {
            return res;
        }
        q.offer(pRoot);
        int depth = 0;

        while (!q.isEmpty()) {
            int sz = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            if (depth % 2 == 0) {
                for (int i = 0; i < sz; i++) {
                    TreeNode cur = q.poll();
                    level.add(cur.val);
                    if (cur.left != null) {
                        q.offer(cur.left);
                    }
                    if (cur.right != null) {
                        q.offer(cur.right);
                    }
                }
            } else {
                for (int i = 0; i < sz; i++) {
                    TreeNode cur = q.poll();
                    level.add(cur.val);
                    if (cur.left != null) {
                        q.offer(cur.left);
                    }
                    if (cur.right != null) {
                        q.offer(cur.right);
                    }
                }
                Collections.reverse(level);
            }
            res.add(level);
            depth++;
        }

        return res;
    }
}
