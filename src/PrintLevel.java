import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// JZ78 把二叉树打印成多行
public class PrintLevel {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> track;
        q.offer(pRoot);

        while (!q.isEmpty()) {
            int sz = q.size();
            track = new ArrayList<>();
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                track.add(cur.val);
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
            res.add(track);
        }

        return res;
    }
}
