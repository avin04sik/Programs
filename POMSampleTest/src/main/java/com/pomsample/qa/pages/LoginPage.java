package com.pomsample.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pomsample.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	
	//Page Factory -- OR
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="submitBtn")
	WebElement loginBtn;
	
	
		
	@FindBy(xpath="//img[@class='logo']")
	WebElement emsLogo;
	
	/*@FindBy(xpath="//div[contains(@text,'Gtpl Bank']")
	WebElement gtplbankText;
	*/
	
	//Initializing the Page Objects
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean  validateEMSLogo(){
		return emsLogo.isEnabled();
	}
	
	
	/*public boolean validateGtplText(){
		return gtplbankText.isDisplayed();
	}*/
	
	public HomePage login(String uname,String pwd){
		System.out.println("uname:--- " +uname);
		username.sendKeys(uname);
		password.sendKeys(pwd);
	    loginBtn.click();
	    
	    return new HomePage();
	}
	
	
}
