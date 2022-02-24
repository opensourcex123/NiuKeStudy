import java.util.ArrayList;
import java.util.HashMap;

// JZ38 字符串的排列
public class Permutation {
    ArrayList<String> res = new ArrayList<>();
    HashMap<Integer, Character> hm = new HashMap<>();
    public ArrayList<String> Permutation(String str) {
        StringBuilder track = new StringBuilder();
        backtrack(str, track);
        return res;
    }

    private void backtrack(String str, StringBuilder track) {
        if (track.length() == str.length() && !res.contains(track.toString())) {
            res.add(track.toString());
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(i)) {
                continue;
            }
            track.append(str.charAt(i));
            hm.put(i, str.charAt(i));
            backtrack(str, track);
            track.deleteCharAt(track.length() - 1);
            hm.remove(i);
        }
    }
}
