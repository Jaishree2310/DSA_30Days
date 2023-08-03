

// class Day1_Q3 {
//     public int strStr(String haystack, String needle) {
//         if(haystack.length()<needle.length()) return -1;
//         return rabinKarp(haystack, needle);
//     }
//     public int rabinKarp(String s, String b){
//         int n=s.length();
//         int m=b.length();
//         int d=256;
//         int q=101;
//         int h=1;
//         for(int i=0;i<m-1;i++){
//             h=(h*d)%q;
//         }
//         int p=0;
//         int t=0;
//         for(int i=0;i<m;i++){
//             p=(d*p + b.charAt(i))%q;
//             t=(d*t + s.charAt(i))%q;
//         }
//         for(int i=0;i<=n-m;i++){
//             if(p==t){
//                 boolean flag=true;
//                 for(int j=0;j<m;j++){
//                     if(s.charAt(j+i) != b.charAt(j)){
//                         flag=false;
//                         break;
//                     }
//                 }
//                 if(flag) return i;
//             }
//             if(i<n-m){
//                 t=(d*(t-s.charAt(i)*h) + s.charAt(i+m)) % q;
//                 if(t<0) t+=q;
//             }
//         }
//         return -1;
//     }
// }

//Find the Index of the First Occurrence in a String

public class Day1_Q3 {
    public static void main(String[] args) {
        Day1_Q3 day1 = new Day1_Q3();

        String haystack = "Hello, this is a test string.";
        String needle = "test";

        int index = day1.strStr(haystack, needle);

        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }
    }

    private int strStr(String haystack, String needle) {
        return 0;
    }
}
