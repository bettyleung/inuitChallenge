package com.inuit; /**
 * Created by b on 7/1/16.
 */

import java.util.Collections;
import java.util.ArrayList;

public class TopTwo {
    public ArrayList<Integer> findTopTwoMax(ArrayList<Integer> al){
        ArrayList<Integer> sol =  new ArrayList<>();
        Collections.sort(al); //O(nlogn)
        sol.add(al.get(al.size() - 1));
        sol.add(al.get(al.size() - 2));
        return sol;
    }
}
