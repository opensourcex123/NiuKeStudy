import java.util.HashMap;

// JZ19 正则表达式匹配
public class match {
    HashMap<String, Boolean> hm = new HashMap<>();
    public boolean match (String str, String pattern) {
        // write code here
        return dp(str, 0, pattern, 0);
    }

    private boolean dp(String str, int i, String pattern, int j) {
        if (j == pattern.length()) {
            return i == str.length();
        }

        if (i == str.length()) {
            if ((pattern.length() - j) % 2 == 1) {
                return false;
            } else {
                return true;
            }
        }

        String key = i + "," + j;
        if (hm.containsKey(key)) {
            return hm.get(key);
        }
        boolean res = false;
        if (str.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '.') {
            if (j < pattern.length() - 1 && pattern.charAt(j + 1) == '*') {
                res = dp(str, i, pattern, j + 2) || dp(str, i + 1, pattern, j);
            } else {
                res = dp(str, i + 1, pattern, j + 1);
            }
        } else {
            if (j < pattern.length() - 1 && pattern.charAt(j + 1) == '*') {
                res = dp(str, i, pattern, j + 2);
            } else {
                res = false;
            }
        }
        hm.put(key, res);
        return res;
    }
}
