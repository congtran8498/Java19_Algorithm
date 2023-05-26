public class single_number {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int out = singleNumber(nums);
        System.out.println(out);
    }
    public static int singleNumber(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        return 0;
    }
    //https://leetcode.com/problems/single-number/submissions/954521451/
}
