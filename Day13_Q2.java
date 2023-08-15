//67. Add Binary


// public class Day13_Q2 {
//     public String addBinary(String a, String b) {
//         StringBuilder res = new StringBuilder();
//         int i = a.length() - 1;
//         int j = b.length() - 1;
//         int carry = 0;
//         while(i >= 0 || j >= 0){
//             int sum = carry;
//             if(i >= 0){
//                 sum += a.charAt(i) - '0';
//                 i--;
//             }
//             if(j >= 0){ 
//                 sum += b.charAt(j) - '0';
//                 j--;
//             }
//             carry = sum > 1 ? 1 : 0;
//             res.append(sum % 2);
//         }
//         if(carry != 0){ 
//             res.append(carry);
//         }
//         return res.reverse().toString();
    
//     }
// }

public class Day13_Q2 {
    public static void main(String[] args) {
        Day13_Q2 day13 = new Day13_Q2();
        
        String a = "1010";
        String b = "1101";
        
        String result = day13.addBinary(a, b);
        System.out.println("Binary sum: " + result);
    }

    private String addBinary(String a, String b) {
        return null;
    }

    }

