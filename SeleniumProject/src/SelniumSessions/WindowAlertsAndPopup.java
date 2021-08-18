package SelniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAlertsAndPopup {

	static WebDriver driver=null;
	private static final long TimeOut = 10;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v88\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\10050725\\Desktop\\ent_body.txt");
	}

}
