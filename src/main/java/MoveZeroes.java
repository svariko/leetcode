package main.java;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int temp;

        for (int source = 0; source < nums.length; source++) {
            if (nums[source] == 0) {
                for (int dest = source + 1; dest < nums.length; dest++) {
                    if (nums[dest] != 0) {
                        temp = nums[source];
                        nums[source] = nums[dest];
                        nums[dest] = temp;
                        break;
                    }
                }
            }
        }
    }
}
