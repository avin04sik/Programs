package com.ems.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ems.qa.base.TestBase;
import com.ems.qa.pages.HomePage;
import com.ems.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
		
	@BeforeMethod
	public void setUp(){
		intialization();
		loginPage=new LoginPage();
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title=driver.getTitle();
		Assert.assertEquals(title, "EMS");
	}
	
	@Test(priority=2)
	public void emsLogoImageTest(){
		boolean logoPresent=loginPage.validateEMSLogo();
		Assert.assertEquals(logoPresent, true);
	}
	@Test(priority=3)
	public void loginTest(){
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
    @AfterMethod
    public void tearDown(){
	  driver.quit();
    }
}
