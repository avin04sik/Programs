package com.pomsample.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pomsample.qa.base.TestBase;

public class EntitlementPage extends TestBase{
	
	//Page Objects:
	
	@FindBy(xpath="//p[contains(text(),'Add New Customer')]")
    WebElement addNewCustLabel;
	
	@FindBy(xpath="//input[contains(@name='name')]")
	WebElement custNameText;
	
	@FindBy(xpath="//input[contains(@type='date')]")
	WebElement custDOB;

	@FindBy(xpath="//testarea[contains(@name='addr')]")
	WebElement custAddr;
	
	@FindBy(xpath="//input[contains(@name='city')]")
	WebElement custCity;
	
	@FindBy(xpath="//input[contains(@name='state')]")
	WebElement custState;
	
	@FindBy(xpath="//input[contains(@name='pinno')]")
	WebElement custPIN;
	
	@FindBy(xpath="//input[contains(@name='telephoneno')]")
	WebElement custTeleNo;
	
	@FindBy(xpath="//input[@name='emailid'	```````````````]")
	WebElement custEmail;
	
	@FindBy(xpath="//input[contains(@name='sub')]")
	WebElement custSubmit;
	
	@FindBy(xpath="//input[contains(@name='res')]")
	WebElement custReset;
	
	
	public EntitlementPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public boolean validateNewCustomerPage(){
		return custNameText.isDisplayed();
		
	}
	
	public void addNewCustomer(){
		
	}
}
