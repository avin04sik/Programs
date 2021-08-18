package seleniumprograms;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotInSelnium {
	
	
	public static void main(String[] args) {	
	
	WebDriver driver;
	long date=new Date().getTime();
	String screenshotFile="C:\\Avineesh\\htmlPages\\screen"+date+".png";
	 boolean screeshotSaved=false;

	System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	
    driver.get("C:\\Avineesh\\htmlPages\\demo.html");
    
 screeshotSaved = takeScreenshot(driver,screenshotFile);
	
 if (screeshotSaved==true)
	 System.out.println("screenshot saved");
 else
	 System.out.println("screenshot save failed");
    driver.close();
	}

	private static boolean takeScreenshot(WebDriver driver, String screenshotFile) {
		// TODO Auto-generated method stub
		
		TakesScreenshot scrShot=(TakesScreenshot) driver;
		
		File scrFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		File destFile=new File(screenshotFile);
		
	
	
		
		try {
			FileUtils.copyFile(scrFile,destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
}
