//452. Minimum Number of Arrows to Burst Balloons

import java.util.Arrays;

public class Day14_Q1 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        Arrays.sort(points, (o1, o2) -> {
            if (o1[1] == o2[1]) return 0;
            if (o1[1] < o2[1]) return -1;
            return 1;
        });

        int arrows = 1;
        int xStart, xEnd, firstEnd = points[0][1];
        for (int[] p: points) {
            xStart = p[0];
            xEnd = p[1];

            if (firstEnd < xStart) {
                arrows++;
                firstEnd = xEnd;
            }
        }

        return arrows;
    }

    public static void main(String[] args) {
        // Example 
        Day14_Q1 solution = new Day14_Q1();
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int minArrows = solution.findMinArrowShots(points);
        System.out.println("Minimum arrows required: " + minArrows);
    }
}

