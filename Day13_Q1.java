//453. Minimum Moves to Equal Array Elements

// import java.util.Arrays;

// public class Day13_Q1{
//     public int minMoves(int[] nums) {
//         Arrays.sort(nums);
//         int a = 0;
//         for(int i = 0; i<nums.length;i++){
//             int b = -1*(nums[0] - nums[i]);
//             a = a+b;
//         }
//         return a;
//     }
// }

import java.util.Arrays;

public class Day13_Q1 {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            int b = -1 * (nums[0] - nums[i]);
            a = a + b;
        }
        return a;
    }

    public static void main(String[] args) {
    
        int[] nums = {3, 1, 6, 10};
        Day13_Q1 day13 = new Day13_Q1();
        int result = day13.minMoves(nums);
        System.out.println("Minimum moves: " + result);
    }
}
