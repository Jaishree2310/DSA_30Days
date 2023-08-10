//2734. Lexicographically Smallest String After Substring Operation
public class Day8_Q3 {
    
    public String smallestString(String s) {
        StringBuilder substring = new StringBuilder(s);
        boolean flag = true;
        for(int i = 0; i < substring.length(); i++) {
            if(substring.charAt(i) == 'a') {
                if(!flag) {
                    break;
                }
                if(i == substring.length() - 1 && flag) {
                    substring.setCharAt(i, 'z');
                }
            } else {
                flag = false;
                char ch = (char) (substring.charAt(i) - 1); 
                substring.setCharAt(i, ch);
            }
        }
        return substring.toString();
    }

    public static void main(String[] args) {
        
        Day8_Q3 solution = new Day8_Q3();
        String input = "bcddefgh";
        String result = solution.smallestString(input);
        System.out.println("Smallest string: " + result);
    }
}


