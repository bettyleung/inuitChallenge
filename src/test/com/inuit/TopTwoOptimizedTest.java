package com.inuit;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

/**
 * Created by b on 7/2/16.
 */
public class TopTwoOptimizedTest {
    TopTwoOptimized tto;
    ArrayList<Integer> res3;
    ArrayList<Integer> res4;

    @Before
    public void setup(){
        tto = new TopTwoOptimized();
        res3 = new ArrayList<>(Arrays.asList(5,100,10,125,15,150,20,175,25,0));
        res3 = tto.findTopTwoMax(res3); //[175, 150]
        res4 = new ArrayList<>(Arrays.asList(25,93,97,18,71,114,52,48));
        res4 = tto.findTopTwoMax(res4); //[114, 97]
    }

    @Test
    public void testTopTwoOptimizedClass(){
        assertEquals(res3.size(), 2);
    }

    @Test
    public void testTopTwoClassOptimizedContentsOne(){
        int val1 = res3.get(0);
        int val2 = 175;

        assertEquals(val1, val2 ); //[175, 150], [114, 97]
        val1 = res3.get(1);
        val2 = 150;
        assertEquals(val1, val2 ); //[175, 150], [114, 97]
    }

    @Test
    public void testTopTwoClassOptimizedContentsTwo(){
        int val1 = res4.get(0);
        int val2 = 114;

        assertEquals(val1, val2 ); //[175, 150], [114, 97]
        val1 = res4.get(1);
        val2 = 97;
        assertEquals(val1, val2 ); //[175, 150], [114, 97]
    }

    @Test(expected=IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        res3 = new ArrayList<>(Arrays.asList(0));
        TopTwoOptimized tto = new TopTwoOptimized();
        tto.findTopTwoMax(res3);
    }
}