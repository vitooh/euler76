package countingSummations;

import static org.junit.Assert.*;
import java.util.Arrays; 
import java.io.*; 
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void isBallancedTest()
    {
        assertTrue(App.isBallanced(new int[]{1,1,2}) );
	assertFalse(App.isBallanced(new int[]{1,1,2,5}) );
    }

    @Test
    public void buildArrayTest()
    {
	assertTrue(Arrays.equals(App.buildArray(4,4), new int[]{1,1,1,1}));
        assertTrue(Arrays.equals(App.buildArray(4,3), new int[]{1,1,2}));
        assertTrue(Arrays.equals(App.buildArray(9,4), new int[]{1,1,1,6}));
    }

    @Test
    public void flatArrayTest()
    { 
	assertTrue( Arrays.equals( App.flatArray(new AppArray(new int[]{1,1,1,2})).array, new int[]{1,1,1,2} ));
	assertTrue( Arrays.equals( App.flatArray(new AppArray(new int[]{1,1,1,6})).array, new int[]{1,1,2,5} ));
	assertTrue( Arrays.equals( App.flatArray(new AppArray(new int[]{1,2,3,6})).array, new int[]{2,2,3,5} ));
	assertTrue( Arrays.equals( App.flatArray(new AppArray(new int[]{3,6})).array, new int[]{4,5} ));
    }
}
