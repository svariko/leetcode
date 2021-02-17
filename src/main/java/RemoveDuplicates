public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int count = 0;
        int key = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                continue;
            }

            key = nums[i];
            nums[count + 1] = nums[i];
            count += 1;
        }

        return (count + 1);

    }
}
