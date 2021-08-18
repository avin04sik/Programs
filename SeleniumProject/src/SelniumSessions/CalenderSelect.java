package SelniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CalenderSelect {

	static WebDriver driver=null;
	private static final long TimeOut = 50;
	private static final long PageTimeOut = 60;
	static WebElement searchText=null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v90\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().pageLoadTimeout(PageTimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		
       
		
		//Thread.sleep(5000);
	
		 driver.get("http://demo.guru99.com/test/");

	        //Find the date time picker control

	        WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

	        //Fill date as mm/dd/yyyy as 09/25/2013

	        dateBox.sendKeys("09-11-2013");

	        //Press tab to shift focus to time field

	        dateBox.sendKeys(Keys.TAB);

	        //Fill time as 02:45 PM

	        dateBox.sendKeys("14:45");
	      //  Thread.sleep(10000);
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        Thread.sleep(1000);
	        if(driver.findElement(By.xpath("//*[contains(.,'Your Birth Date is 2013-11-09')]")).isDisplayed())
	        	System.out.println("date selection is success");
	        
				driver.quit();
		
	}

}
