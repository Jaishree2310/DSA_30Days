//146. LRU Cache

import java.util.HashMap;

public class Day14_Q3 {
    class LRUCache {
    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int cap;
    HashMap<Integer, Node> m = new HashMap<>();

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }

    private void addNode(Node newnode) {
        Node temp = head.next;

        newnode.next = temp;
        newnode.prev = head;

        head.next = newnode;
        temp.prev = newnode;
    }

    private void deleteNode(Node delnode) {
        Node prevv = delnode.prev;
        Node nextt = delnode.next;

        prevv.next = nextt;
        nextt.prev = prevv;
    }

    public int get(int key) {
        if (m.containsKey(key)) {
            Node resNode = m.get(key);
            int ans = resNode.val;

            m.remove(key);
            deleteNode(resNode);
            addNode(resNode);

            m.put(key, head.next);
            return ans;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (m.containsKey(key)) {
            Node curr = m.get(key);
            m.remove(key);
            deleteNode(curr);
        }

        if (m.size() == cap) {
            m.remove(tail.prev.key);
            deleteNode(tail.prev);
        }

        addNode(new Node(key, value));
        m.put(key, head.next);
    }
}
public static void main(String[] args) {

    Day14_Q3 solution = new Day14_Q3();
    LRUCache cache = solution.new LRUCache(2); 

    cache.put(1, 1);
    cache.put(2, 2);
    System.out.println(cache.get(1)); // Output: 1

    cache.put(3, 3); 
    System.out.println(cache.get(2)); // Output: -1 (not found)

    cache.put(4, 4); 
    System.out.println(cache.get(1)); // Output: -1 (not found)
    System.out.println(cache.get(3)); // Output: 3
    System.out.println(cache.get(4)); // Output: 4
}
}
