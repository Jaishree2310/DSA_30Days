//258. Add Digits


public class Day19_Q1 {
    public static void main(String[] args) {
        // You can create an instance of the Solution class and call the addDigits method here.
        Day19_Q1 solutionInstance = new Day19_Q1();
        int num = 123; // Replace with the desired number
        int result = solutionInstance.new Solution().addDigits(num);
        System.out.println("Result: " + result);
    }

    class Solution {
        public int addDigits(int num) {
            if(num == 0) return 0;
            else if(num % 9 == 0) return 9;
            else return num % 9;
        }
    }
}
