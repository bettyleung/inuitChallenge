package com.inuit; /**
 * Created by b on 7/1/16.
 */

import org.testng.annotations.Test;

import java.util.ArrayList;

public class TopTwoOptimized {
    public ArrayList<Integer> findTopTwoMax(ArrayList<Integer> al) {
        ArrayList<Integer> sol = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        if (al.size() > 1) {
            for (int cur : al) { //O(n)
                if (cur > max) {
                    secondMax = max;
                    max = cur;
                }
            }
        } else {
            throw new IllegalArgumentException("Input list length must be greater than one.");
        }

        sol.add(max);
        sol.add(secondMax);
        return sol;
    }

}