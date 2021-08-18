package SelniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowserTesting {

	static WebDriver driver=null;
	private static final long TimeOut = 20;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v88\\chromedriver_win32\\chromedriver.exe");
		
		//driver= new ChromeDriver();
		
		// HtmlUnitDriver is not available in Selenium 3.X version onwards
		//For HtmlUnittDriver - to use this we need to download HtmlUnitDriver jar file.
		
		
		//Advantages of HtmlUnitDriver
		//1. testing is happening behind the scene i.e no browser is launched.
		//2. Execution of testcases is very fast.it will improve performance of script
		//3. not suitable for action class like user movements like mouse movements,drag n drop, double click
		//4. also called ghostDriver or headless Browser
		 // HtmlUnitDriver -  java
		//PhantomJS -JavaScipt
		
		driver= new HtmlUnitDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().pageLoadTimeout(TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		
		driver.get("https://ui.cogmento.com/");
		
		System.out.println("before login Title is :---" +driver.getTitle());
		
		Thread.sleep(5000);
	//	if(driver.findElement(By.name("email")).isDisplayed()){
		//	driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys("avin.sik@gmail.com");
			
		//}
		
		//if(driver.findElement(By.name("password")).isDisplayed()){
			//driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("Demo@123");
			
		//}
		
		//if(driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).isDisplayed()){
			driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		//}
		
		Thread.sleep(5000);
		System.out.println("after login Title is :---" +driver.getTitle());
		driver.quit();
	}

}
