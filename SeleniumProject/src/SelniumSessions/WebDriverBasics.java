package SelniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {
	
	static WebDriver driver=null;
	static String title=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// For Firefox driver
		System.setProperty("webdriver.gecko.driver", "C:\\Avineesh\\Software\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		
		title=driver.getTitle();
		System.out.println("Firefox browser title:---- "+ title);
		
		if(title.equals("Google"))
			System.out.println("Correct title");
		else
			System.out.println("Incorrect title");
		driver.quit();
		
// For ChromeDriver		
		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v88\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.google.com");
		title=driver.getTitle();
		System.out.println("Chrome browser title:---- "+ title);
		
		if(title.equals("Google"))
			System.out.println("Correct title");
		else
			System.out.println("Incorrect title");
		driver.quit();
	}

}
