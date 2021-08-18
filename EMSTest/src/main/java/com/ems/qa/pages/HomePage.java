package com.ems.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ems.qa.base.TestBase;
import com.ems.qa.util.TestUtil;

public class HomePage extends TestBase{
	//Page Factory --OR
	
			
		@FindBy(xpath="//img[contains(@class,'logo')]")
		WebElement emsLogo;
		
		@FindBy(xpath="//span{contains(@class,'tab-title')")
		WebElement gettingStartedTab;
		
		@FindBy(xpath="//h1[contains(@class,'h2')]")
				WebElement welcomeEMSLogo;
		
		//Actions
		public String validateHomePageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateHomeEMSLogo(){
			String xpathString="//img[contains(@class,'logo')]";
			TestUtil.webElementWait(driver, xpathString);
			return emsLogo.isDisplayed();
		}
		
		public boolean validateGettingStartedPresent(){
			String xpathString="//span{contains(@class,'tab-title')";
			TestUtil.webElementWait(driver, xpathString);
			return gettingStartedTab.isDisplayed();
			
		}
		
		public void clickGettingStartedTab(){
			
			 gettingStartedTab.click();
		}
		
		public boolean validatewelcomeEMSLogoPresent(){
			//String xpathString="//span{contains(@class,'tab-title')";
		//	TestUtil.webElementWait(driver, xpathString);
			return welcomeEMSLogo.isDisplayed();
		}
}


