package base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {

	@BeforeSuite
	public void myBeforeSuite(){
		System.out.println("@BeforeSuite:Starting Selenium Deriver");
	}
	@AfterSuite
public void myAfterSuite(){
		System.out.println("@AfterSuite:Stopping Selenium Driver");
	}
	
	@BeforeTest
	public void myBeforeTest(){
		System.out.println("@BeforeTest: Starting Before test");
	}
	@AfterTest
public void myAfterTest(){
		System.out.println("@AfterTest: Stopping After test");
	}
}
