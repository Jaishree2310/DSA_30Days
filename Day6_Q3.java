//14. Longest Common Prefix

import java.util.Arrays;

public class Day6_Q3 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int idx = 0;
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }

    public static void main(String[] args) {
        // Example usage
        Day6_Q3 solution = new Day6_Q3();

        String[] input = {"flower", "flow", "flight"};
        String commonPrefix = solution.longestCommonPrefix(input);

        System.out.println("Longest common prefix: " + commonPrefix);
    }
}


