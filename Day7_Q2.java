//974. Subarray Sums Divisible by K


public class Day7_Q2 {
    public int subarraysDivByK(int[] nums, int k) {
        return k;
        
    }

    public static void main(String[] args) {
        // Example usage
        Day7_Q2 day7 = new Day7_Q2();
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        int result = day7.subarraysDivByK(nums, k);
        System.out.println("Number of subarrays divisible by " + k + ": " + result);
    }
}

