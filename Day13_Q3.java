//202. Happy Number

// import java.util.HashSet;

// public class Day13_Q3 {
//         public boolean isHappy(int n) {
//         HashSet<Integer> track = new HashSet<>();
//         while (n!=1 && !track.contains(n)){
//             track.add(n);
//             int sum = 0;
//             while (n!=0){
//                 int remainder = n%10;
//                 sum += (remainder*remainder);
//                 n /= 10;
//             }
//             n = sum;
//         }
//         return n==1 ? true : false;
//     }
// }

public class Day13_Q3 {
    public static void main(String[] args) {
        Day13_Q3 day13Q3 = new Day13_Q3();

        int number = 19;
        boolean isHappy = day13Q3.isHappy(number);
        
        if (isHappy) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }

    private boolean isHappy(int number) {
        return false;
    }
}

