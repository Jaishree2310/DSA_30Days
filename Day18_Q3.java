//58.

public class Day18_Q3 {
    class Solution {
        public int lengthOfLastWord(String s) {
            String newstr = s.trim();
            int count = 0;
            int i = newstr.length() - 1;
            while (i >= 0 && newstr.charAt(i) != ' ') {
                count++;
                i--;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Day18_Q3 day18 = new Day18_Q3();
        Solution solution = day18.new Solution();

        String input = "Hello World";
        int result = solution.lengthOfLastWord(input);
        System.out.println("Length of last word: " + result);
    }
}

