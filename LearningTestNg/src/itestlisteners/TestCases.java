package itestlisteners;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;		

@Listeners(itestlisteners.ListenerTestExample.class)	

public class TestCases{	
	

@Test		
public void TestToFail1()				
{		
 System.out.println("inside TestToFail1");					
 Assert.assertTrue(false);			
}	

@Test		
public void TestPass1()				
{		
 System.out.println("inside TestPass1");					
 Assert.assertTrue(true);			
}	

@Test		
public void passTest1()				
{		
 System.out.println("inside passTest1");					
 Assert.assertTrue(true);			
}	
}