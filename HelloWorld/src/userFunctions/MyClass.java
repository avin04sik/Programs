package userFunctions;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	
	static String xpath="";
	static String response,url;
	static WebDriver driver;
	static WebElement userName,pwd,submitBtn,helpLink;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\ChromeDriver_v88\\chromedriver_win32\\chromedriver.exe");
	    driver =new ChromeDriver();
		url="https://emsldk-daily02.highend.engg-services.com";
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userName=driver.findElement(By.xpath("/html/body/ems-root/ems-login-home/ems-isv-login/div/div/div/form/div[1]/input"));
		pwd=driver.findElement(By.xpath("/html/body/ems-root/ems-login-home/ems-isv-login/div/div/div/form/div[2]/input"));
		submitBtn=driver.findElement(By.id("submitBtn"));
		userName.clear();
		userName.sendKeys("admin");
		pwd.clear();
		pwd.sendKeys("admin");
		submitBtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		xpath="//*[@id='ems-navbar-menu']/div/ul/li[2]/a";
		helpLink=driver.findElement(By.xpath(xpath));
		String attribute="href";
		if(helpLink.isDisplayed())
			response=getWebElementAttributeValue(xpath,attribute);
		System.out.println("help link url:---- "+response.toString());
		driver.quit();
			
	}
	private static String getWebElementAttributeValue(String xpath2,String attrName) {
		System.out.println("insidd method");
		System.out.println("xpath2:----" +xpath2.toString());
		// TODO Auto-generated method stub
		//String status="Yes";
		WebElement webElementXpath = driver.findElement(By.xpath(xpath2.toString()));
		String e = webElementXpath.getAttribute(attrName.toString());
		System.out.println("HHHHHHHH:---"+e.toString());
		return e;
	}

}
