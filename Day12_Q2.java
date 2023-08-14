//169. Majority Element


import java.util.Arrays;

public class Day12_Q2 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2}; 

        Day12_Q2 solution = new Day12_Q2();
        int majorityElement = solution.majorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}

