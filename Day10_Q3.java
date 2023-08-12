//70. Climbing Stairs

import java.util.Map;
import java.util.HashMap;

public class Day10_Q3 {
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairs(n, memo);
    }
    
    private int climbStairs(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
        }
        return memo.get(n);
    }

    public static void main(String[] args) {
        
        Day10_Q3 solution = new Day10_Q3();
        int steps = 4; 
        int ways = solution.climbStairs(steps);
        System.out.println("Number of ways to climb stairs: " + ways);
    }
}

