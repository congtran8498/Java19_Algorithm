import java.util.Arrays;

public class majority_element {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int out = majorityElement(nums);
        System.out.println(out);
    }
    public static int majorityElement(int[] nums){
        int out = 0;
        int count = 0;
        Arrays.sort(nums);
        if(nums.length == 1){
            out = nums[0];
        }
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]){
                count = 0;
            }else{
                count++;
            }
            if(count >= nums.length/2){
                out = nums[i];
            }
        }
        return out;
    }
    //https://leetcode.com/problems/majority-element/submissions/956816984/
}
