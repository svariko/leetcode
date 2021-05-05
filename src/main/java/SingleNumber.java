package main.java;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            }
            else {
                set.remove(nums[i]);
            }
        }
        return (int) set.toArray()[0];
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] input = new int[] {2, 2, 1};


        int calculatedSingle = singleNumber.singleNumber(input);

    }
}
