package SelniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	static WebDriver driver=null;
	private static final long TimeOut = 20;
	private static final long PageTimeOut = 30;
	static WebElement searchText=null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v90\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().pageLoadTimeout(PageTimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com/");
		
		searchText= driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
		if(searchText.isDisplayed())
		searchText.sendKeys("testing");
	
		
		//get all list suggesstions
		List <WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='aypzV']"));
		System.out.println("Total number of suggestions in search box:---  "+list.size());
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
		
	       if(list.get(i).getText().contains("testing interview questions")){
	    	   
	    	   list.get(i).click();
	           break;
	       }
		}
		Thread.sleep(1000);
			driver.quit();
	}

}
