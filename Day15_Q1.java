// 496. Next Greater Element I


import java.util.HashMap;
import java.util.Stack;

public class Day15_Q1{
public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = nums2.length-1; i>=0; i--){
            
            if(stack.isEmpty()) {
                // arr[i] = -1;
                map.put(nums2[i], -1);
            }
            else if(!stack.isEmpty() && nums2[i]< stack.peek()){
                // arr[i]= stack.peek();
                map.put(nums2[i], stack.peek());
            }
            else{ // (!stack.isEmpty() && nums2[i]>= stack.peek())

                while(!stack.isEmpty() && nums2[i]>= stack.peek()){
                    stack.pop();
                }
                    if(stack.isEmpty()){
                        // arr[i]= -1;
                        map.put(nums2[i], -1);
                    }
                    else{
                        // arr[i] = stack.peek();
                        map.put(nums2[i], stack.peek());
                    }    
            }
            stack.push(nums2[i]);
        }

        int ans[] = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        // Example 
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };
        
        Day15_Q1 solution = new Day15_Q1();
        int[] result = solution.nextGreaterElement(nums1, nums2);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
}
}
