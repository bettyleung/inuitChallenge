import com.inuit.TopTwo;
import com.inuit.TopTwoOptimized;
import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by b on 7/1/16.
 */
public class SolutionTest {
    /*
        test if results return expected
        test if one number is bigger than the other
        test if input is too small, exception is thrown
     */

    ArrayList<Integer> res1;
    ArrayList<Integer> res2;

    ArrayList<Integer> res3;
    ArrayList<Integer> res4;

    TopTwo tt;
    TopTwoOptimized tto;
    @Before
    public void setup(){
        tt = new TopTwo();
        res1 = new ArrayList<Integer>(Arrays.asList(5,100,10,125,15,150,20,175,25,0));
        res1 = tt.findTopTwoMax(res1);
        res2 = new ArrayList<Integer>(Arrays.asList(25,93,97,18,71,114,52,48));
        res2 = tt.findTopTwoMax(res2);

        tto = new TopTwoOptimized();
        res3 = new ArrayList<Integer>(Arrays.asList(5,100,10,125,15,150,20,175,25,0));
        res3 = tto.findTopTwoMax(res3);
        res4 = new ArrayList<Integer>(Arrays.asList(25,93,97,18,71,114,52,48));
        res4 = tto.findTopTwoMax(res4);
    }
    @Test
    public void testTopTwoClass(){
        assertEquals(res1.size(), 2);
    }

    @Test
    public void testTopTwoClassContents(){
        int val1 = res1.get(0);
        int val2 = 175;

        assertEquals(val1, val2 ); //[175, 150], [114, 97]
        val1 = res1.get(1);
        val2 = 150;
        assertEquals(val1, val2 ); //[175, 150], [114, 97]
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testArrayIndexOutOfBoundsException() {
        res1 = new ArrayList<Integer>(Arrays.asList(5));
        TopTwo tt = new TopTwo();
        tt.findTopTwoMax(res1);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        res1 = new ArrayList<Integer>(Arrays.asList(0));
        TopTwoOptimized tto = new TopTwoOptimized();
        tto.findTopTwoMax(res1);
    }

    public static junit.framework.Test suite(){
        return new JUnit4TestAdapter(SolutionTest.class);
    }
}
