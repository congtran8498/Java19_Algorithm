import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] solution = solution(nums, target);
        System.out.println(Arrays.toString(solution));
    }
    public static int[] solution(int[] nums, int target){
        int[] out = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    out[0] = i;
                    out[1] = j;
                }
            }
        }
        return out;
    }
    //https://leetcode.com/problems/two-sum/submissions/898409081/
}
