package assertions;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;


public class HardAssertExample {
	@Test
	public void myTest(){
		try{
		assertTrue(checkBigger(5,10));
		}catch(Throwable t){
		
		        System.out.println("End of mt Test");
		  }
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
	@Test
	public void  myTest2(){
		assertTrue("First number is smaller than second number",checkBigger(15,10));
	}
}
