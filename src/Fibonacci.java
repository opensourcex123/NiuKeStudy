// JZ10 斐波那契数列
public class Fibonacci {
    public int Fibonacci(int n) {
        int dp_0 = 0;
        int dp_1 = 1;
        int dp = 1;
        for (int i = 2; i < n + 1; i++) {
            dp = dp_1 + dp_0;
            dp_0 = dp_1;
            dp_1 = dp;
        }

        return dp;
    }
}
