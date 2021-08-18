package SelniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	static WebDriver driver=null;
	static WebElement locator=null;
	private static final long TimeOut = 20;
	static int time=20;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v88\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);

		driver.navigate().to("http://www.facebook.com");
		
		
		locator=driver.findElement(By.xpath("//*[@name='login']"));
		
		clickOn(driver, locator, time);
		driver.quit();
		
		
	}
	public static void clickOn(WebDriver driver,WebElement ele,int timeout){
		
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		
		
	}

}
