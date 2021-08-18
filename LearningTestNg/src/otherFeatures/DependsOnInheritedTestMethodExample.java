package otherFeatures;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

import assertions.AssertTrueExample;

public class DependsOnInheritedTestMethodExample extends ParentClassExample{
  @Test(dependsOnMethods="myTestE")
  public void myTestA() {
  
	  System.out.println("I am in My Test A");
	 //1st failure
	  // assertTrue(false);
  }
  
  @Test
  public void myTestB() {
  
	  System.out.println("I am in My Test B");
	  //second failure
	//  assertTrue(false);
  }
  
}
