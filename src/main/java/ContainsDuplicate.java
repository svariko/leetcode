package main.java;
import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        if (nums == null || nums.length == 0) {
            return false;
        }

        Arrays.sort(nums);

        int previous = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == previous) {
                return true;
            }
            else {
                previous = nums[i];
            }
        }
        return false;

    }
}
