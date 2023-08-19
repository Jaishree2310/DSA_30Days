//
// import java.util.Stack;

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();
//         int count = 0;
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
//                 stack.push(s.charAt(i));
//                 count++;
//             } else {
//                 if (stack.isEmpty()) return false;
//                 char ch = stack.pop();
//                 if ((s.charAt(i) == ')' && ch == '(') || (s.charAt(i) == ']' && ch == '[') || (s.charAt(i) == '}' && ch == '{')) {
//                 } else {
//                     return false;
//                 }
//                 count--;
//             }
//         }
//         return count == 0;
//     }
// }




class Solution {
    public boolean isValid(String s) {
        return false;
        // Your isValid implementation here
    }
}

public class Day17_Q2 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String input = "()[]{}";
        boolean isValid = solution.isValid(input);
        System.out.println("Is valid: " + isValid);
    }
}

