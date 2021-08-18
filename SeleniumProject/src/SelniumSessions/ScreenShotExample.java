package SelniumSessions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample {

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
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File file = ts.getScreenshotAs(OutputType.FILE);
		try{
		     FileUtils.copyFile(file,new File ("C:\\Avineesh\\Test_screenshot_google.png"));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
