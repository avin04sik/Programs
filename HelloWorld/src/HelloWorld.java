import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TestData.Step;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Hello World- Jenkins!!!!");
      
      
      System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v88\\chromedriver_win32\\chromedriver.exe");
   WebDriver   driver = new ChromeDriver();
      String url = "https://www.tutorialspoint.com/index.htm";


		
	   //   driver.get(url);
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      // get current URL and print
	       String strUrl = driver.getCurrentUrl();
	      System.out.println("Current Url is:"+ strUrl);
	      
	      driver.quit();
	}

}
