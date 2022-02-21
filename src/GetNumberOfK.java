// JZ53 数字在升序数组中出现的次数
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int rightBound = rightBound(array, k);
        int leftBound = leftBound(array, k);
        if (rightBound == -1 && leftBound == -1) {
            return 0;
        }
        return rightBound - leftBound + 1;
    }

    private int leftBound(int[] arr, int tar) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == tar) {
                right = mid - 1;
            } else if (arr[mid] < tar) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (left >= arr.length || arr[left] != tar) {
            return -1;
        }

        return left;
    }

    private int rightBound(int[] arr, int tar) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == tar) {
                left = mid + 1;
            } else if (arr[mid] < tar) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (right < 0 || arr[right] != tar) {
            return -1;
        }

        return right;
    }
}
