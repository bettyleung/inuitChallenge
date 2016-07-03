package com.inuit;
import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;

/**
 * Created by b on 7/1/16.
 */
public class SolutionTest {
    public static junit.framework.Test suite(){
        TestSuite suite = new TestSuite("main");
        suite.addTest(new JUnit4TestAdapter(TopTwoTest.class));
        suite.addTest(new JUnit4TestAdapter(TopTwoOptimizedTest.class));
        return suite;
    }
}
