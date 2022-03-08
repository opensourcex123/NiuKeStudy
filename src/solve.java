// JZ46 把数字翻译成字符串
public class solve {
    public int solve (String nums) {
        // write code here
        int[] dp = new int[nums.length()];
        dp[0] = nums.charAt(0) == '0' ? 0 : 1;
        for (int i = 1; i < nums.length(); i++) {
            if (nums.charAt(i) != '0') {
                dp[i] = dp[i - 1];
            }

            int num = (nums.charAt(i - 1) - '0') * 10 + (nums.charAt(i) - '0');
            if (num >= 10 && num <= 26) {
                if (i == 1) {
                    dp[i]++;
                } else {
                    dp[i] += dp[i - 2];
                }
            }
        }

        return dp[nums.length() - 1];
    }
}
