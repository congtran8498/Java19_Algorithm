public class jump_game {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        boolean out = canJump(nums);
        System.out.println(out);
    }
    public static boolean canJump(int[] nums) {
        int a = 0;
        if(nums.length == 1){
            return true;
        }
        for(int i=0;i<nums.length;i++){
            a = Math.max(a-1,nums[i]);
            if(i== nums.length-1){
                return true;
            }
            if(a<=0){
                break;
            }
        }
        return false;
    }
    //https://leetcode.com/problems/jump-game/submissions/956832451/
}
