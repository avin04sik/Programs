package SelniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	static WebDriver driver=null;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
	   Properties prop=new Properties();
	   
	   FileInputStream fis=new FileInputStream("C:\\Users\\10050725\\workspace\\SeleniumProject\\src\\SelniumSessions\\config.properties");
	   prop.load(fis);
	   
	  System.out.println(prop.getProperty("url")); 
	  System.out.println(prop.getProperty("name"));
	  System.out.println(prop.getProperty("browser"));
	  
	  
	  String browserName=prop.getProperty("browser");
	  String url=prop.getProperty("url");
	  
	  if(browserName.equals("chrome")){
		  System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v88\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
	  }
	  else if(browserName.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Avineesh\\Software\\geckodriver-v0.24.0-win32\\geckodriver.exe");
			driver= new FirefoxDriver();
	  }
	  
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  
	  System.out.println(driver.getTitle());
	  
	  driver.quit();
	}
	

}
