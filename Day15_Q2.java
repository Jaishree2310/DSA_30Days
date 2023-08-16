//168. Excel Sheet Column Title


public class Day15_Q2 {
    public String convertToTitle(int columnNumber) {
        final StringBuilder sb = new StringBuilder();

        while (columnNumber-- > 0) {
            sb.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Day15_Q2 solution = new Day15_Q2();
        
        int columnNumber = 28; 
        String result = solution.convertToTitle(columnNumber);
        
        System.out.println("Column Title: " + result);
    }
}

