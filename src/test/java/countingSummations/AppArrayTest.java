package countingSummations;

import static org.junit.Assert.*;
import java.util.Arrays; 

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppArrayTest 
{
	
	@Test 
	public void constructorTest() {
		AppArray test = new AppArray(new int[]{1,2,3});
		assertTrue( Arrays.equals( test.array, new int[]{1,2,3} ) );
		assertEquals( test.max, 3);
		assertEquals( test.min, 1);
		assertFalse( test.ballanced );
		AppArray test1 = new AppArray(new int[]{1,1,2});
                assertTrue( Arrays.equals( test1.array, new int[]{1,1,2} ) );
                assertEquals( test1.max, 2);
                assertEquals( test1.min, 1);
                assertTrue( test1.ballanced );
		AppArray test2 = new AppArray(new int[]{3,6});
		assertEquals(test2.min, 3);
		AppArray test3 = new AppArray(App.buildArray(10,10));
		assertTrue(test3.ballanced);
//		assertTrue(Arrays.equals(test.flattened().array, App.buildArray(10,10)));
	} 
}
