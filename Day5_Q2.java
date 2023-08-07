//77. Combinations

import java.util.List;
import java.util.ArrayList;

public class Day5_Q2 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinations(1, n, k, new ArrayList<Integer>(), result);
        return result;
    }

    private void generateCombinations(int start, int n, int k, List<Integer> combination, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        for (int i = start; i <= n - k + 1; i++) {
            combination.add(i);
            generateCombinations(i + 1, n, k - 1, combination, result);
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        
        Day5_Q2 day5 = new Day5_Q2();
        int n = 5;
        int k = 3;
        List<List<Integer>> combinations = day5.combine(n, k);
        System.out.println(combinations);
    }
}
