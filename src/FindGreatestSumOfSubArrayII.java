// JZ85 连续子数组的最大和(二)
public class FindGreatestSumOfSubArrayII {
    public int[] FindGreatestSumOfSubArray (int[] array) {
        // write code here
        int maxsum = array[0];//记录遍历过的连续子数组和的最大值
        int cursum = array[0];//当前遍历的连续子数组的和
        int start = 0, end = 0;//窗口[start,end]，记录最终窗口结果的下标
        int left = 0, right = 1;//当前遍历窗口
        while(right < array.length) {
            if(cursum < 0) {
                cursum= array[right];//无论当前数是正还是负，但是sum已经是负数了，当前值加上sum肯定比当前值还要小，所以将sum更新为当前值
                left = right;//更新当前遍历窗口的左边界
            }
            else{
                cursum += array[right];
            }
            if(cursum>maxsum || cursum == maxsum && ((right-left) > (end-start))) {
                //1.当前连续子数组的和大于之前记录的最大和；或者
                //2.当前连续子数组的和等于之前记录的最大和，但当前长度更长
                start = left;
                end = right;
            }
            maxsum = Math.max(maxsum, cursum);
            right++;
        }

        int[] res = new int[end-start+1];//结果数组的长度为end-start+1
        for(int i = start;i <= end; i++) {//复制到结果数组
            res[i-start] = array[i];
        }
        return res;
    }
}
