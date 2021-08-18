package SelniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovements {

	static WebDriver driver=null;
	private static final long TimeOut = 10;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v88\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		driver.findElement(By.linkText("SpiceMAX")).click();
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
