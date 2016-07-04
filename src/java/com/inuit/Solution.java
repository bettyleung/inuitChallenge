package com.inuit;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by b on 7/1/16.
 * create objects TopTwo and TopTwoOptimized, then call each object's
 * method, findTopTwoMax using the 2 given inputs. Then print results.
 */

public class Solution {
    public static void main(String[] args) {
        TopTwo tt = new TopTwo();
        TopTwoOptimized tto = new TopTwoOptimized();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5,100,10,125,15,150,20,175,25,0));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(25,93,97,18,71,114,52,48));
        ArrayList<Integer> results = new ArrayList<>();

        //print results using TopTwo's findTopTwoMax
        results = tt.findTopTwoMax(list1);
        System.out.println(results.toString());
        results = tt.findTopTwoMax(list2);
        System.out.println(results.toString());

        //print results using TopTwoOptimized's findTopTwoMax
        results = tto.findTopTwoMax(list1);
        System.out.println(results.toString());
        results = tto.findTopTwoMax(list2);
        System.out.println(results.toString());
    }
}
