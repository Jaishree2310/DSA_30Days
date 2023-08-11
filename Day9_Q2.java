//933. Number of Recent Calls

import java.util.ArrayList;

public class Day9_Q2 {
    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();
        
        int[] timestamps = {1, 100, 3001, 3002};
        for (int timestamp : timestamps) {
            int result = counter.ping(timestamp);
            System.out.println("Number of recent pings: " + result);
        }
    }
}

class RecentCounter {
    ArrayList<Integer> calls;

    public RecentCounter() {
        calls = new ArrayList<Integer>();
    }

    public int ping(int t) {
        calls.add(t);
        int count = 0;
        for (Integer call : calls) {
            if (t - call <= 3000)
                count++;
        }
        return count;
    }
}



