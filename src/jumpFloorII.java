// JZ71 跳台阶扩展问题
public class jumpFloorII {
    public int jumpFloorII(int target) {
        int pre = 1;
        int cur = 1;
        for (int i = 2; i < target + 1; i++) {
            cur = 2 * pre;
            pre = cur;
        }

        return cur;
    }
}
