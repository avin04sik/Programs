package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnAndChckBoxSelection {
	
	 public static void main(String[] args) {	
		 
		 //declare the chrome driver
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			 driver.get("C:\\Avineesh\\htmlPages\\demo.html");
			
			WebElement radio1= driver.findElement(By.id("vfb-7-1"));
			
			if(!radio1.isSelected())
				radio1.click();
			
			WebElement radio2= driver.findElement(By.id("vfb-7-2"));
			
			if(!radio2.isSelected())
				radio2.click();
			
			// Selecting CheckBox		
	        WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

	        // This will Toggle the Check box 		
	        option1.click();			

	        // Check whether the Check box is toggled on 		
	        if (option1.isSelected()) {					
	            System.out.println("Checkbox is Toggled On");					

	        } else {			
	            System.out.println("Checkbox is Toggled Off");					
	        }		
	        
	        driver.quit();
	 }

}
