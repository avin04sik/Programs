package com.ems.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ems.qa.base.TestBase;
import com.ems.qa.util.TestUtil;

public class LoginPage extends TestBase{

		
	//Page Factory --OR
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="submitBtn")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[contains(@class,'logo')]")
	WebElement emsLogo;
	
	
	//Initializing the Page Objects
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateEMSLogo(){
		String xpathString="//img[contains(@class,'logo')]";
		TestUtil.webElementWait(driver, xpathString);
		return emsLogo.isDisplayed();
	}
	
	public HomePage login(String uname,String pwd){
		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
		
	}
}
