package annotations;

import org.testng.annotations.Test;

import base.TestBase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class AfterClassExample extends TestBase{
  @Test
  public void testMethodThree() {
	  
	  System.out.println("This is a test method Three");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClassExample >> Inside AfterClass");
  }

	@BeforeClass
	public void myBeforeClassMethod(){
		System.out.println("AfterClassExample >> > Inside BeforeClass ");
	}
	

	@BeforeMethod
	public void myBeforeMethod(){
		System.out.println("AfterClassExample >> Inside Before method");
	}
	
	@AfterMethod
	public void myAfterMethod(){
		System.out.println("AfterClassExample >> Inside after method");
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
