// JZ33 二叉搜索树的后序遍历序列
public class VerifySequenceOfBST {
    public boolean VerifySequenceOfBST(int [] sequence) {
        int n = sequence.length;
        if (n == 0) return false;

        return check(sequence, 0, n - 1);
    }

    private boolean check(int[] sequence, int lo, int hi) {
        if (lo >= hi) return true;

        int root = sequence[hi];
        int j = hi - 1;
        while (j >= 0 && sequence[j] > root) j--;

        for (int i = lo; i <= j; i++) {
            if (sequence[i] >= root) return false;
        }

        return check(sequence, lo, j) && check(sequence, j + 1, hi - 1);
    }
}
