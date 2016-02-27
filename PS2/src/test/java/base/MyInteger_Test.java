package base;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
	}
	static MyInteger object = new MyInteger(2);
	static MyInteger object1 = new MyInteger(3);
	static MyInteger object2 = new MyInteger(7);
	
	@Test
	public void testIsEven(){
		boolean bExpectedResult = true;
		boolean bActualResult = object.isEven();
		assertEquals(bExpectedResult, bActualResult);
	}
	
	@Test
	public void testIsOdd(){
		boolean bExpectedResult = true;
		boolean bActualResult = object1.isOdd();
		assertEquals(bExpectedResult, bActualResult);
	}
		
	@Test
	public void testIsPrime(){
		boolean bExpectedResult = true;
		boolean bActualResult = object2.isPrime();
		assertEquals(bExpectedResult, bActualResult);
	}
}
			
	
	
	
	
