package otherFeatures;

import org.testng.annotations.Test;

public class PriorityExample {
  @Test(priority=0)
  public void myTestOne() {
  System.out.println("Running myTest One");
  }
  
  @Test(priority=1)
  public void myTestTwo() {
  System.out.println("Running myTest Two");
  }
  
  @Test(priority=2)
  public void myTestThree() {
  System.out.println("Running myTest Three");
  }
  
  @Test(priority=3)
  public void myTestFour() {
  System.out.println("Running myTest Four");
  }
}
