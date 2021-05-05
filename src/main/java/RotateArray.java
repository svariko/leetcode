package main.java;

public class RotateArray {



    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k % nums.length == 0) {
            return;
        }

        int kEffective = k % nums.length;
        int[] rotated = new int[nums.length];

        System.arraycopy(nums, nums.length - kEffective, rotated, 0, kEffective);
        System.arraycopy(nums, 0, rotated, kEffective, nums.length - kEffective);

        System.arraycopy(rotated, 0, nums, 0, nums.length);

    }

}
