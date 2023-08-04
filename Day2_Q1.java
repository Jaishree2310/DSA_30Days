import java.util.HashSet;

public class Day2_Q1 {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Example usage of the findDuplicate method
        int[] nums = {1, 3, 4, 2, 2};
        Day2_Q1 solution = new Day2_Q1();
        int duplicate = solution.findDuplicate(nums);
        System.out.println("Duplicate number: " + duplicate);
    }
}
