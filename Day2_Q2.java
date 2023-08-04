//Remove Duplicates from Sorted Array

public class Day2_Q2 {
    public int removeDuplicates(int[] nums) {
        int a = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        // Example usage of the removeDuplicates method
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        Day2_Q2 solution = new Day2_Q2();
        int newLength = solution.removeDuplicates(nums);

        System.out.println("New length after removing duplicates: " + newLength);
        System.out.print("Array with duplicates removed: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
