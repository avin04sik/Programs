package SelniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	static WebDriver driver=null;
	private static final long TimeOut = 20;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v88\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.amazon.com");
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		driver.navigate().refresh();
		driver.quit();
	
	}

}
