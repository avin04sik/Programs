package SelniumSessions;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertAndPopup {

	private static final long TimeOut = 10;
	static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//validate webpage alerts
		validateAlerts();
		
		
			}

	/**
	 * @throws InterruptedException
	 */
	private static void validateAlerts() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v88\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		if(driver.findElement(By.className("signin")).isDisplayed())
		driver.findElement(By.className("signin")).click();
		else 
			System.out.println("page not loaded properly!!!!");
		
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		if(driver.findElement(By.name("proceed")).isDisplayed()){
		  driver.findElement(By.name("proceed")).click();
		  //System.out.println("system test ");
		}
		else
			System.out.println("page not loaded properly!!!!");
		
		Alert alert=driver.switchTo().alert();
	   
		
	 //   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	    Thread.sleep(5000);
	    
	   String text=alert.getText();
	    
	    if(text.equals("Please enter a valid user name"))
	    	System.out.println("Correct alert message");
	    else
	    	System.out.println("in-correct alert message");
	    alert.accept(); // to click on ok/submit
		
	//	alert.dismiss(); // to clikc on Cancel/dismiss
		
		driver.quit();
	}

}
