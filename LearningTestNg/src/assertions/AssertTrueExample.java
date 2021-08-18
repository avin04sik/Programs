package assertions;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;


public class AssertTrueExample {
	@Test
	public void myTest(){
		
		assertTrue(checkBigger(15,10));
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
	public void  myTestwithMessage(){
		assertTrue("First number is smaller than second number",checkBigger(5,10));
	}
}
