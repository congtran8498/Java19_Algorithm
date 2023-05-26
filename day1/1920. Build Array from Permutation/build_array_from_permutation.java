import java.util.Arrays;

public class build_array_from_permutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] out  = buildArray(nums);
        System.out.println(Arrays.toString(out));
    }
    public static int[] buildArray(int[] nums) {
        int[] out = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            out[i] = nums[nums[i]];
        }
        return out;
    }
    //https://leetcode.com/problems/build-array-from-permutation/submissions/955762410/
}
