package groupingFeature;

import org.testng.annotations.Test;

public class GroupingExample {
  @Test(groups={"Breakfast","Food"})
  public void testA() {
	  
	  System.out.println("bread");
  }
  
  @Test(groups="Breakfast")
  public void testB() {
	  
	  System.out.println("butter");
  }
  
  @Test(groups="Dinner")
  public void testC() {
	  
	  System.out.println("chicken");
  }
  
  @Test(groups="Dinner")
  public void testE() {
	  
	  System.out.println("Burger");
  }
  @Test(groups="Dinner")
  public void testF() {
	  
	  System.out.println("Drinking");
  }
  
  @Test(groups="Breakfast")
  public void testD() {
	  
	  System.out.println("Tea");
  }
  
  @Test(groups="Lunch")
  public void testG() {
	  
	  System.out.println("Roll");
  }
  
  @Test(groups="Lunch")
  public void testH() {
	  
	  System.out.println("Pizza");
  }
}
