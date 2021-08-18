package com.pomsample.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.pomsample.qa.base.TestBase;
import com.pomsample.qa.pages.HomePage;
import com.pomsample.qa.pages.LoginPage;



public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest(){
		super();
	}

	

	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
	  String homePageTitle=	homePage.verifyHomePageTitle();
	
	  Assert.assertEquals(homePageTitle, "EMS","EMS");
	}
	
	@Test(priority=1)
	public void validateClickAdminLinkTest(){
		
     //Assert.assertTrue(homePage.clickAdminLink());
		Assert.assertTrue(false);
	}

	@Test(priority=1)
	public void validateLogoutLinkTest(){
	     Assert.assertTrue(homePage.verifyLogoutLink());
		
		}

	
	@Test(priority=1)
	public void validateEntLinkTest(){
	     Assert.assertTrue(homePage.verifyEntLink());
		
		}
	
	@Test(priority=1)
	public void validateVisibleHelpLinkTest(){
	     Assert.assertTrue(homePage.visibleHelpLink());
		
		}

	
	@Test(priority=1)
	public void verifyLogOutLinkTest(){
	     Assert.assertTrue(homePage.verifyLogoutLink());
		
		}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
