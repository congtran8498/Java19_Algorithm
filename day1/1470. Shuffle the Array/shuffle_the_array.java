import java.util.Arrays;

public class shuffle_the_array {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] out = shuffle(nums,n);
        System.out.println(Arrays.toString(out));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] out = new int[nums.length];
        int a = 0;
        for (int i = 0; i < nums.length; i += 2) {
            out[i] = nums[a++];
            out[i + 1] = nums[n++];
        }
        return out;
    }
    //https://leetcode.com/problems/shuffle-the-array/submissions/955081173/
}
