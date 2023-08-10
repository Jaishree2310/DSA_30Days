//81. Search in Rotated Sorted Array II

public class Day8_Q1 {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if (nums[mid] == nums[left]) {
                left++;
                continue;
            }

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        Day8_Q1 solution = new Day8_Q1();
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        boolean result = solution.search(nums, target);
        System.out.println("Target found: " + result);
    }
}
