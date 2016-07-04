package com.inuit; /**
 * Created by b on 7/1/16.
 */

import java.util.ArrayList;

public class TopTwoOptimized {
    /*
        optimized version with runtime of O(n)
        1) check if input > 1 else throw IllegalArgumentException, O(1)
        2) create max and secondMax set to the smallest integer
           possible, O(1)
        3) iterate through input array, max set to anything larger
           than it currently is, and secondMax set to max, O(n)
        4) return the arraylist
     */
    public ArrayList<Integer> findTopTwoMax(ArrayList<Integer> al) {
        if (al.size() > 1) {
            ArrayList<Integer> sol = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for (int cur : al) { //O(n)
                if (cur > max) {
                    secondMax = max;
                    max = cur;
                }
            }
            sol.add(max);
            sol.add(secondMax);
            return sol;
        } else {
            throw new IllegalArgumentException("Input list length must be greater than one.");
        }
    }
}