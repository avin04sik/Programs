package otherFeatures;

import org.testng.annotations.Test;

public class DisableTestExample {
  @Test(enabled=false)
  public void myDisableTest() {
  System.out.println("Running my disable test 1");
  }
  
  @Test
  public void myDisableTestTwo() {
  System.out.println("Running my disable test 2");
  }
}
