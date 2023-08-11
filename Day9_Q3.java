//1732. Find the Highest Altitude
public class Day9_Q3 {
    public int largestAltitude(int[] gain) {
        int sum = 0, large = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            large = Math.max(sum, large);
        }
        return large;
    }

    public static void main(String[] args) {
        // You can add your code to test the 'largestAltitude' method here.
        // For example:
        int[] gainArray = {-5, 1, 5, 0, -7};
        Day9_Q3 day9 = new Day9_Q3();
        int result = day9.largestAltitude(gainArray);
        System.out.println("Largest Altitude: " + result);
    }
}


