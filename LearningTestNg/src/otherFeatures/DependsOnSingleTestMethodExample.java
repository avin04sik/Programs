package otherFeatures;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

import assertions.AssertTrueExample;

public class DependsOnSingleTestMethodExample {
  @Test(dependsOnMethods="myTestB")
  public void myTestA() {
  
	  System.out.println("I am in My Test A");
	 //1st failure
	  // assertTrue(false);
  }
  
  @Test
  public void myTestB() {
  
	  System.out.println("I am in My Test B");
	  //second failure
	  assertTrue(false);
  }
  
  
  @Test(dependsOnMethods="myTestD")
  public void myTestC() {
  
	  System.out.println("I am in My Test C");
  }
  
  @Test
  public void myTestD() {
  
	  System.out.println("I am in My Test D");
  }
}
