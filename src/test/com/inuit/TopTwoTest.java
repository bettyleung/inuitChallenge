package com.inuit;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

/**
 * Created by b on 7/2/16.
 */

public class TopTwoTest {
    /*
        test if results return expected
        test if one number is bigger than the other
        test if input is too small, exception is thrown
     */
    TopTwo tt;
    ArrayList<Integer> list1;
    ArrayList<Integer> list2;

    @Before
    public void setup(){
        tt = new TopTwo();
        list1 = new ArrayList<>(Arrays.asList(5,100,10,125,15,150,20,175,25,0));
        list1 = tt.findTopTwoMax(list1);  //[175, 150]
        list2 = new ArrayList<>(Arrays.asList(25,93,97,18,71,114,52,48));
        list2 = tt.findTopTwoMax(list2);  //[114, 97]
    }
 
    @Test
    public void testTopTwoSize(){
        assertEquals(list1.size(), 2);
    }

    @Test
    public void testTopTwoClassList1(){
        int val1 = list1.get(0);
        int val2 = 175;

        assertEquals(val1, val2 );
        val1 = list1.get(1);
        val2 = 150;
        assertEquals(val1, val2 ); 
    }

    @Test
    public void testTopTwoClassList2(){
        int val1 = list2.get(0);
        int val2 = 114;

        assertEquals(val1, val2 );
        val1 = list2.get(1);
        val2 = 97;
        assertEquals(val1, val2 );
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testArrayIndexOutOfBoundsException() {
        list1 = new ArrayList<>(Arrays.asList(5));
        TopTwo tt = new TopTwo();
        tt.findTopTwoMax(list1);
    }

}