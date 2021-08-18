package otherFeatures;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

import assertions.AssertTrueExample;

public class ParentClassExample {
  @Test(dependsOnMethods="myTestF")
  public void myTestE() {
  
	  System.out.println("I am in My Test E");
	 //1st failure
	  // assertTrue(false);
  }
  
  @Test
  public void myTestF() {
  
	  System.out.println("I am in My Test F");
	  //second failure
	//  assertTrue(false);
  }
  
  
}
