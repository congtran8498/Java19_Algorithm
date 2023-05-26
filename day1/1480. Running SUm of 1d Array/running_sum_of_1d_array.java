import java.util.Arrays;

public class running_sum_of_1d_array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] out = runningSum(nums);
        System.out.println(Arrays.toString(out));
    }
    public static int[] runningSum(int[] nums){
        int[] out = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            out[i] = sum;
        }
        return out;
    }
    //https://leetcode.com/problems/running-sum-of-1d-array/submissions/954525211/
}
