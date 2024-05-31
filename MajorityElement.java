import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
