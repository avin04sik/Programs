package com.pomsample.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pomsample.qa.base.TestBase;
import com.pomsample.qa.pages.HomePage;
import com.pomsample.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		
		loginPage=new LoginPage();
	}
	

	@Test(priority=1)
	public void loginPagetitleTest(){
		String title =loginPage.validateLoginPageTitle();
	    
		
		System.out.println("title:--- "+ title);
        Assert.assertEquals(title, "EMS");
	}
	
	@Test(priority=1)
	public void emsLogoTest(){
		boolean flag=loginPage.validateEMSLogo();
	
	    Assert.assertTrue(flag);
	}
	
	
	@Test(priority=3 ,enabled=false)
	public void copyRightTextTest(){
		//boolean flag2=loginPage.validateGtplText();
		
	    Assert.assertTrue(true);
	}
	
	
	
   @Test(priority=1)
	public void loginTest(){
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
