package com.pomsample.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pomsample.qa.base.TestBase;

public class HomePage extends TestBase{
	
	//Page Obejcts
	
	@FindBy(xpath="//*[@class='tab-icon'][@href='/ui-ems/ems/entitlements']")
	WebElement entLink;
	
	
	
	@FindBy(xpath="//a[@class='nav-link']")
	WebElement helpLink;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	WebElement logOutLink;
	
	@FindBy(id="user-dropdown-toggle")
	WebElement adminLink;
	
	
	//Initializing the Page Objects
		public HomePage(){
			PageFactory.initElements(driver, this);
			
		}
		
		
		
		public String verifyHomePageTitle(){
			return driver.getTitle();
		}
		
		public boolean verifyEntLink(){
			return  entLink.isDisplayed();
		}
		
		
		
		
		public boolean visibleHelpLink(){
		 return	helpLink.isDisplayed();
			
		}
		
	
		public boolean clickAdminLink(){
			return	adminLink.isDisplayed();
		
		}
		
	
		
		public boolean verifyLogoutLink(){
			adminLink.click();
			return  logOutLink.isDisplayed();
		}
}
