package otherFeatures;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

import assertions.AssertTrueExample;

public class DependsOnGroupsAndDepenedsOnMethodTestExample {
  @Test(dependsOnGroups="Group1")
  public void myTestA() {
  
	  System.out.println("I am in My Test A");
	 //1st failure
	//  assertTrue(false);
  }
  
  @Test(groups="Group1")
  public void myTestB() {
  
	  System.out.println("I am in My Test B");
	  //second failure
	  assertTrue(false);
  }
  
  
  @Test(groups="Group1")
  public void myTestC() {
  
	  System.out.println("I am in My Test C");
  }
  
 
}
