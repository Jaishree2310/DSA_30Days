//442. Find All Duplicates in an Array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day7_Q3 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                l1.add(nums[i]);
            }
        }
        return l1;
    }

    public static void main(String[] args) {
    
        Day7_Q3 day7 = new Day7_Q3();
        int[] nums = {4, 3, 2, 7, 8, 2, 1, 1};
        List<Integer> duplicates = day7.findDuplicates(nums);
        System.out.println("Duplicate elements: " + duplicates);
    }
}

