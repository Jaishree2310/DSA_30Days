//implement queue using stack
public class Day3_Q3 {

    public static void main(String[] args) {
        
        Day3_Q3 queue = new Day3_Q3();
        
        queue.push(1);
        queue.push(2);
        queue.push(3);
        
        System.out.println("Front element: " + queue.peek()); // Should print 1
        
        queue.pop(); // Remove the front element (1)
        
        System.out.println("Front element after pop: " + queue.peek()); // Should print 2
        
        System.out.println("Is queue empty? " + queue.empty()); // Should print false
        
        queue.pop();
        queue.pop();
        
        System.out.println("Is queue empty after popping all elements? " + queue.empty()); // Should print true
    }

    private String peek() {
        return null;
    }

    private String empty() {
        return null;
    }

    private void pop() {
    }

    private void push(int i) {
    }
}
