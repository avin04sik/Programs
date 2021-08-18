package assertions;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertExample {
	@Test
	public void myTest(){
		SoftAssert softAssert=new SoftAssert();
	//	assertTrue(checkBigger(5,10));
		softAssert.assertTrue(checkBigger(5, 10));
		System.out.println("end of my test");
		
		softAssert.assertAll();
		}
	public boolean checkBigger(int x,int y){
		boolean result;
		
		if(x>y)
			result=true;
		else 
			result= false;
		
		return result;
	}
	@Test
	public void  myTestTwo(){
		assertTrue("First number is smaller than second number",checkBigger(15,10));
	}
}
