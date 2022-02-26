// JZ42 连续子数组的最大和
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int res = array[0];
        int pre = array[0];
        int cur;
        for (int i = 1; i < array.length; i++) {
            cur = Math.max(array[i], pre + array[i]);
            if (cur > res) {
                res = cur;
            }
            pre = cur;
        }
        return res;
    }
}
