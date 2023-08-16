//268. Missing Number

import java.util.Arrays;

public class Day14_Q2 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        if (nums[nums.length - 1] != nums.length) {
            return nums.length;
        } else if (nums[0] != 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            int expectedNum = nums[i - 1] + 1;
            if (nums[i] != expectedNum) {
                return expectedNum;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // Example 
        Day14_Q2 solution = new Day14_Q2();
        int[] nums = {3, 0, 1};
        int missingNumber = solution.missingNumber(nums);
        System.out.println("Missing number: " + missingNumber);
    }
}

