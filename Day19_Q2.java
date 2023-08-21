//27. Remove Element


public class Day19_Q2 {
    public static void main(String[] args) {
        // Create an instance of the Solution class and test the removeElement method.
        Day19_Q2 solutionInstance = new Day19_Q2();
        int[] nums = {3, 2, 2, 3, 4, 5, 3}; // Replace with your array of numbers
        int val = 3; // Replace with the value you want to remove
        int length = solutionInstance.new Solution().removeElement(nums, val);

        System.out.println("New Length: " + length);
        System.out.print("Array after removing " + val + ": ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    class Solution {
        public int removeElement(int[] nums, int val) {
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
        }
    }
}

