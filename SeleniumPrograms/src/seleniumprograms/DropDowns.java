package seleniumprograms;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("C:\\Avineesh\\htmlPages\\dynamic-state-dropdown-master\\dynamic-state-dropdown.html");
		
//		Select select= new Select(driver.findElement(By.id("adultDropdown")));
//		select.selectByValue("2");
		System.out.println("browser Opens!!!!!");
		
		WebElement chooseStateText,pickState;
		List <WebElement> suggestedStates;
		
		chooseStateText=driver.findElement(By.xpath("//*[contains(.,'Choose a State')]"));
		
		if(chooseStateText.isDisplayed())
			System.out.println("header is visible!!!!!");
		
		
		pickState=driver.findElement(By.xpath("//input[@type='text']"));
		
		pickState.sendKeys("Alaska");
		
		suggestedStates=driver.findElements(By.className("selectize-dropdown-content"));
		
		for(WebElement temp : suggestedStates){
			
			System.out.println("*********"+temp.getText());
			if(temp.getText().equalsIgnoreCase("Alaska")){
				temp.click();
			}
		}
		
		WebElement state= driver.findElement(By.className("item"));
		
		System.out.println(state.getText().equalsIgnoreCase("Alaska"));
		
		Assert.assertTrue(state.getText().equalsIgnoreCase("Alaska"));
		
		
		
		driver.quit();
		
	}

}
