package newpackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG {
	
	
	private static String gekoPath="C://Avineesh//Software//geckodriver-v0.24.0-win32//";
	private static String chromePath="C://Avineesh//Software//chromedriver_win32//";
	private static String iePath="C://Avineesh//Software//IEDriverServer_x64_3.14.0//";
	

	
	private WebDriver driver=null;
	String appUrl="https://sinfit03.fit.engg-services.com/ui-ems/login";
	
	
	private static String CHROME_DRIVER="CHROME";
	private static String FIREFOX_DRIVER="FIREFOX";
	private static String IE_DRIVER="IE";
	private String driverType=null;
	
	private static String USERNAME_XPATH=null;
	private static String PASSWORD_XPATH=null;
  @Test
  public void emsTest() {
  
	  //driverType=CHROME_DRIVER;
	  //driverType=FIREFOX_DRIVER;
	  driverType=FIREFOX_DRIVER; //CHROME_DRIVER,FIREFOX_DRIVER,IE_DRIVER;
	  
	driver=intializeDriver(driverType);
	
	loadProperties();
	
	applicationWait(10);
    
	driver.get(appUrl);
    
    driver.manage().window().maximize();
    
   
    String expectedTitle="EMS";
    
    
    applicationWait(30);
   
    String  actualTitle=driver.getTitle();
    
    System.out.println("actual title :--- "+ actualTitle +"");
    
    Assert.assertEquals(actualTitle, expectedTitle);
  //  applicationWait(20);

   System.out.println("  USERNAME_XPATH--- "+USERNAME_XPATH);
   System.out.println("  PASSWORD_XPATH--- "+PASSWORD_XPATH);
   
   WebElement username=driver.findElement(By.id(USERNAME_XPATH));
    explicitWait(username, 20);
    username.clear();
     
    username.sendKeys("admin");
     
          
     WebElement password=driver.findElement(By.id(USERNAME_XPATH));
     
     explicitWait(password, 20);
     password.clear();
     
     password.sendKeys("admin");
     
     WebElement loginBtn= driver.findElement(By.id("login"));
    
     loginBtn.click();
     
     applicationWait(10);
     
     expectedTitle= "Home Page";
     actualTitle=driver.getTitle();
     
     System.out.println("actual title for Home :--- "+ actualTitle +"");
     
     Assert.assertEquals(actualTitle, expectedTitle);
     
     
     
     
     WebElement catalog=driver.findElement(By.id("mnuCatalog"));
     
     explicitWait(catalog,20);

     catalog.click();
      
      applicationWait(10);
      
      
      
      expectedTitle= "Product List";
      actualTitle=driver.getTitle();
      
      System.out.println("actual title for Catalog  :--- "+ actualTitle +"");
      
      Assert.assertEquals(actualTitle, expectedTitle);
      
      
      
     driver.close();
  }


private void loadProperties() {
	FileReader reader = null;
	Properties p;
	try {
		reader = new FileReader("xpath.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
    
    p=new Properties();  
   
		try {
			p.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
      
    System.out.println(p.getProperty("username_xpath"));  
    System.out.println(p.getProperty("password_xpath"));
    
    USERNAME_XPATH=p.getProperty("username_xpath");
    PASSWORD_XPATH=p.getProperty("password_xpath");
    
}


private void explicitWait(WebElement element,int waitTime) {
	WebDriverWait wait=new WebDriverWait(driver, waitTime);
     wait.until(ExpectedConditions.visibilityOf(element));
}


private WebDriver intializeDriver(String driverType) {
	try {
		if(driverType.toString().equals(CHROME_DRIVER)){
		System.setProperty("webdriver.chrome.driver",chromePath+"chromedriver.exe");  
		
		driver=new ChromeDriver();
		}
		else if (driverType.toString().equals(FIREFOX_DRIVER)){
			System.setProperty("webdriver.gecko.driver",gekoPath+"geckodriver.exe");  
			
			driver=new FirefoxDriver();
			
		}
		else if(driverType.toString().equals(IE_DRIVER)){
			System.setProperty("webdriver.ie.driver",iePath+"IEDriverServer.exe");  
			
			driver=new InternetExplorerDriver();
			
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return driver;
}


private void applicationWait(int waitTime) {
	driver.manage().timeouts().implicitlyWait(waitTime,TimeUnit.SECONDS) ;
}
}
