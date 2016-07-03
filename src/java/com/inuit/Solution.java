package com.inuit;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by b on 7/1/16.
 */

public class Solution {
    public static void main(String[] args) {
        TopTwo tt = new TopTwo();
        ArrayList<Integer> res = new ArrayList<Integer>(Arrays.asList(5,100,10,125,15,150,20,175,25,0));
        res = tt.findTopTwoMax(res);
        System.out.println(res.toString());

        TopTwoOptimized tto = new TopTwoOptimized();
        ArrayList<Integer> res2 = new ArrayList<Integer>(Arrays.asList(25,93,97,18,71,114,52,48));
        res2 = tto.findTopTwoMax(res2);
        System.out.println(res2.toString());
    }
}
