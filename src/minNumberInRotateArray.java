// JZ11 旋转数组的最小数字
public class minNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        int l = 0;
        int r = array.length - 1;
        // 没有target和端点比较
        while (l <= r) {
            if (array[l] < array[r]) {
                return array[l];
            }
            int mid = l + (r - l) / 2;
            if (array[mid] > array[r]) {
                l = mid + 1;
            } else if (array[mid] < array[r]) {
                r = mid;
            } else {
                r--;
            }
        }

        return array[l];
    }
}
