//3. Longest Substring Without Repeating Characters
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         List<Character> arr=new ArrayList<>();
//     int mc=0,c=0,p=1;
//     for(int i=0;i<s.length();i++){
//         if(arr.contains(s.charAt(i))){
//             mc = c>mc ? c:mc;
//             c=0;
//             i=p;
//             p=p+1;
//         arr=new ArrayList<>();
//         }
//         c++;
//             arr.add(s.charAt(i));
//     }
//     return c>mc ? c:mc;
//     }
// }

//solution 2
// import java.util.Set;
// import java.util.HashSet;
// class Day1_Q1 {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int maxLength = 0;
//         Set<Character> charSet = new HashSet<>();
//         int left = 0;
        
//         for (int right = 0; right < n; right++) {
//             if (!charSet.contains(s.charAt(right))) {
//                 charSet.add(s.charAt(right));
//                 maxLength = Math.max(maxLength, right - left + 1);
//             } else {
//                 while (charSet.contains(s.charAt(right))) {
//                     charSet.remove(s.charAt(left));
//                     left++;
//                 }
//                 charSet.add(s.charAt(right));
//             }
//         }
        
//         return maxLength;
//     }
// }



import java.util.HashSet;
import java.util.Set;

public class Day1_Q1 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Day1_Q1 solution = new Day1_Q1();

        String input = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
