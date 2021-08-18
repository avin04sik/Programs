package otherFeatures;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

import assertions.AssertTrueExample;

public class DependsOnGroupsTestExample {
  @Test(dependsOnGroups="Group1")
  public void myTestA() {
  
	  System.out.println("I am in My Test A");
	
  }
  
  @Test(groups="Group1")
  public void myTestB() {
  
	  System.out.println("I am in My Test B");

  }
  
  
  @Test(groups="Group1", dependsOnMethods="myTestD")
  public void myTestC() {
  
	  System.out.println("I am in My Test C");
  }
  
  @Test
  public void myTestD() {
  
	  System.out.println("I am in My Test D");
  }
}
