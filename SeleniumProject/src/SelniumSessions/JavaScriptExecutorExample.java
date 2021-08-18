package SelniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JavaScriptExecutorExample {

	
	static WebDriver driver=null;
	private static final long TimeOut = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v88\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().pageLoadTimeout(TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
		
		driver.get("https://ui.cogmento.com/");
		
		if(driver.findElement(By.name("email")).isDisplayed()){
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys("avin.sik@gmail.com");
			
		}
		
		if(driver.findElement(By.name("password")).isDisplayed()){
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("Demo@123");
			
		}
		
	//	if(driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).isDisplayed()){
		//
		
			
	//	}
		
		//executeScript -  execute the java script code
		WebElement loginBtn=driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		
		flash(loginBtn,driver);
		
		driver.quit();
	}

	
	static void flash(WebElement ele,WebDriver driver){
		
		JavascriptExecutor jse=((JavascriptExecutor) driver);
		String bgColor=ele.getCssValue("backgroundColor");
		for(int i=0;i<10;i++){
			changeColor("rgb(0,200,0)",ele,driver);
			changeColor(bgColor,ele,driver);
		}
	}


	private static void changeColor(String color, WebElement ele, WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor jse=((JavascriptExecutor) driver);
		((JavascriptExecutor) jse).executeScript("arguments[0].style.backgroundColor '"+color+"'",ele);
		
		try {
			  Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
