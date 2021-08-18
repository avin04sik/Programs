package annotations;

import org.testng.annotations.Test;

import base.TestBase;

public class TestAnnotation extends TestBase{
  @Test
  public void testMethod() {
	  
	  System.out.println("This is a test method");
  }
}
