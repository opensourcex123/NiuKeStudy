import java.util.HashMap;

// JZ48 最长不含重复字符的子字符串
public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring (String s) {
        // write code here
        if (s.length() == 0 || s.length() == 1) return 1;
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put(s.charAt(0), 0);
        // 以s[i]为结尾的字符串的最长无重复子串
        int[] dp = new int[s.length()];
        dp[0] = 1;

        for (int i = 1; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                dp[i] = Math.min(i - hm.get(s.charAt(i)), dp[i - 1] + 1);
            } else {
                dp[i] = dp[i - 1] + 1;
            }
            hm.put(s.charAt(i), i);
        }

        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
