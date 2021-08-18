package SelniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableExample {

	static WebDriver driver=null;
	private static final long TimeOut = 20;
	private static final long PageTimeOut = 30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v90\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().pageLoadTimeout(PageTimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		
		driver.get("https://ui.cogmento.com/");
		
		if(driver.findElement(By.name("email")).isDisplayed()){
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys("avin.sik@gmail.com");
			
		}
		
		if(driver.findElement(By.name("password")).isDisplayed()){
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("Demo@123");
			
		}
		
		if(driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).isDisplayed()){
			driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
			}
		
		driver.findElement(By.xpath("//a[@class='item']")).click();
		driver.findElement(By.xpath("//a[@class='item']")).click();
		//if(driver.findElement(By.xpath("//span[@class='item-text']")).isDisplayed())
		//driver.findElement(By.xpath("//span[@class='item-text']")).click();
	}

}
