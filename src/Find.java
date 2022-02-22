// JZ4 二维数组中的查找
public class Find {
    public boolean Find(int target, int [][] array) {
        if (array.length == 0 || array[0].length == 0) {
            return false;
        }
        int i = 0;
        int j = array[0].length - 1;
        while (i < array.length && i >= 0 && j < array[0].length && j >= 0) {
            if (array[i][j] < target) {
                i++;
            } else if (array[i][j] > target) {
                j--;
            } else {
                return true;
            }
        }

        return false;
    }
}