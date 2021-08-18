package itestlisteners;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;		

@Listeners(itestlisteners.ListenerTestExample.class)	

public class TestCases2{	
	

@Test		
public void TestToFail2()				
{		
 System.out.println("inside TestToFail2");					
 Assert.assertTrue(false);			
}	

@Test		
public void TestPass2()				
{		
 System.out.println("inside TestPass2");					
 Assert.assertTrue(true);			
}	

@Test		
public void passTest2()				
{		
 System.out.println("inside  passTest2");					
 Assert.assertTrue(true);			
}	
}