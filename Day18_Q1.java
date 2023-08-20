//383. Ransom Note

// import java.util.HashMap;
// public class Day18_Q1{
// class Solution{
//         public boolean canConstruct(String ransomNote, String magazine) {
//         HashMap<Character,Integer> map=new HashMap<>();
//     for(int i=0;i<magazine.length();i++){
//         map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
//     }
//     for(int i=0;i<ransomNote.length();i++){
//         if(map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i))>0){
//             map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
//         }
//         else {
//             return false;
//         }
//     }
//     return true;
//     }
//     }
// }


import java.util.HashMap;

public class Day18_Q1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String ransomNote = "yourRansomNote";
        String magazine = "yourMagazine";
        
        boolean result = solution.canConstruct(ransomNote, magazine);
        System.out.println("Can construct: " + result);
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i)) > 0) {
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
