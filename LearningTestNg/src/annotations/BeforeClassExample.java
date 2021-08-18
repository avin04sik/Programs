package annotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

public class BeforeClassExample extends TestBase{
	
	@BeforeClass
	public void myBeforeClassMethod(){
		System.out.println("BeforeClassExample >> Inside BeforeClass method");
	}
	

	@BeforeMethod
	public void myBeforeMethod(){
		System.out.println("BeforeClassExample >> Inside Before method");
	}
	
	 @Test
	  public void testMethod() {
		  
		  System.out.println("This is a test method");
	  }
	 
	 @Test
	 public void testMethodTwo() {
		  
		  System.out.println("This is a test method TWO");
	  }
}
