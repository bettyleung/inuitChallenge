package com.inuit; /**
 * Created by b on 7/1/16.
 */

import java.util.Collections;
import java.util.ArrayList;

public class TopTwo {
    /*
        unoptimized version with runtime of O(nlogn)
        1) sorts input in ascending order, O(nlogn)
        2) grabs the last element in sorted input (largest)
           and stores it an arraylist, O(1)
        3) grabs the penultimate element in sorted input (second largest)
           and stores it an arraylist, O(1)
        4) returns the arraylist
     */
    public ArrayList<Integer> findTopTwoMax(ArrayList<Integer> al){
        ArrayList<Integer> sol =  new ArrayList<>();
        Collections.sort(al); //O(nlogn)
        sol.add(al.get(al.size() - 1));
        sol.add(al.get(al.size() - 2));
        return sol;
    }
}
