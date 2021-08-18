package SelniumSessions;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class FrameHandling {
	
	static WebDriver driver=null;
	private static final long TimeOut = 10;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v88\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		
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
		
		System.out.println("login success");
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		//click on contacts tab
		
		driver.findElement(By.xpath("//a[@class='item']")).click();
		driver.findElement(By.xpath("//span[contains(@text(),'Contacts')]")).click();
//		if(driver.findElement(By.xpath("//i[@class='ui mini basic icon button']")).isDisplayed()){
//			driver.findElement(By.xpath("//i[@class='ui mini basic icon button']")).click();
//		}
//		else
//			System.out.println("button is not visible");
			
			//Thread.sleep(5000);
		
	}

}
