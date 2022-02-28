// JZ69 跳台阶
public class jumpFloor {
    public int jumpFloor(int target) {
        int dp_0 = 1;
        int dp_1 = 1;
        int dp = 1;
        for (int i = 2; i < target + 1; i++) {
            dp = dp_0 + dp_1;
            dp_0 = dp_1;
            dp_1 = dp;
        }

        return dp;
    }
}
