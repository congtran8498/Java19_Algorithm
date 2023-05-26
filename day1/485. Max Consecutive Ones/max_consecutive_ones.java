public class max_consecutive_ones {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int max = findMaxConsecutiveOnes(nums);
        System.out.println(max);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
                max = Math.max(max,count);
            }else{
                count = 0;
            }
        }
        return max;
    }
    //https://leetcode.com/problems/max-consecutive-ones/submissions/955089217/
}
