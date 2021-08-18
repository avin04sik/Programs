package otherFeatures;

import org.testng.annotations.Test;

public class TimeoutTestExample {
  @Test
  public void myDisableTest() throws InterruptedException {
  System.out.println("Running my timeout test 1");
  Thread.sleep(6000);
  System.out.println("ending my test 1");
  }
  
  @Test(timeOut=10000)
  public void myDisableTestTwo() throws InterruptedException {
  System.out.println("Running my timeout test 2");
  Thread.sleep(6000);
  System.out.println("ending my test 2");
  }
}
