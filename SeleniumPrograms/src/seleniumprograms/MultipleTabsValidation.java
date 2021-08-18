package seleniumprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsById;

public class MultipleTabsValidation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("C:\\Avineesh\\htmlPages\\demo.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//main window handle
		String mainWindow=driver.getWindowHandle();
		
		
		List <WebElement> links=driver.findElements(By.xpath("//a[contains(text(),'link text')]"));
		//open all the links
		for (int i=0; i<links.size();i++){
	          links.get(i).click();
		    }
		
		//get window handles of the all opened tabs
		Set<String> set =driver.getWindowHandles();
		 // Using Iterator to iterate with in windows
		 Iterator<String> itr= set.iterator();
		 while(itr.hasNext()){
		 String childWindow=itr.next();
		    // Compare whether the main windows is not equal to child window. If not equal, we will close.
		      if(!mainWindow.equals(childWindow)){
		      driver.switchTo().window(childWindow);
		     
		      System.out.println("window tab validated:-- "+driver.switchTo().window(childWindow).getTitle());
		      driver.close();
	       }
		 }
		// This is to switch to the main window
			driver.switchTo().window(mainWindow);
            driver.close();
   }

	
}