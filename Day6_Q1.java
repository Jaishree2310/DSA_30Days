// public class Day6_Q1 {
//         public int search(int[] nums, int target) {
//             int low = 0, high = nums.length - 1;
    
//             while (low <= high) {
//                 int mid = (low + high) / 2;
    
//                 if (nums[mid] == target) {
//                     return mid;
//                 }
    
//                 if (nums[low] <= nums[mid]) {
//                     if (nums[low] <= target && target < nums[mid]) {
//                         high = mid - 1;
//                     } else {
//                         low = mid + 1;
//                     }
//                 } else {
//                     if (nums[mid] < target && target <= nums[high]) {
//                         low = mid + 1;
//                     } else {
//                         high = mid - 1;
//                     }
//                 }
//             }
    
//             return -1;
//         }
//     }

//33. Search in Rotated Sorted Array

public class Day6_Q1 {
    public int search(int[] nums, int target) {
        return target;

    }

    public static void main(String[] args) {
        
        Day6_Q1 solution = new Day6_Q1();

    
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = solution.search(nums, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
