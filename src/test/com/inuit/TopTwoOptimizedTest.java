package com.inuit;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

/**
 * Created by b on 7/2/16.
 * Test to validate TopTwoOptimized's class, findTopTwoMax
 */
public class TopTwoOptimizedTest {
    private TopTwoOptimized tto;
    private ArrayList<Integer> list1;
    private ArrayList<Integer> list2;

    @Before
    public void setup(){
        tto = new TopTwoOptimized();
        list1 = new ArrayList<>(Arrays.asList(5,100,10,125,15,150,20,175,25,0));
        list1 = tto.findTopTwoMax(list1); //[175, 150]
        list2 = new ArrayList<>(Arrays.asList(25,93,97,18,71,114,52,48));
        list2 = tto.findTopTwoMax(list2); //[114, 97]
    }

    //create 2 lists with the given inputs and retrieve results from TopTwo.findTopTwoMax();
    @Test
    public void testTopTwoOptimizedClass(){
        assertEquals(list1.size(), 2);
    }

    //test if [175, 150] is returned from TopTwo.findTopTwoMax(list1);
    @Test
    public void testTopTwoClassOptimizedContentsOne(){
        int val1 = list1.get(0);
        int val2 = 175;

        assertEquals(val1, val2 );
        val1 = list1.get(1);
        val2 = 150;
        assertEquals(val1, val2 );
    }

    //test if [114, 97] is returned from TopTwo.findTopTwoMax(list2);
    @Test
    public void testTopTwoClassOptimizedContentsTwo(){
        int val1 = list2.get(0);
        int val2 = 114;

        assertEquals(val1, val2 );
        val1 = list2.get(1);
        val2 = 97;
        assertEquals(val1, val2 );
    }

    //expect IllegalArgumentException if input's size < 2
    @Test(expected=IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        list1 = new ArrayList<>(Arrays.asList(0));
        TopTwoOptimized tto = new TopTwoOptimized();
        tto.findTopTwoMax(list1);
    }
}