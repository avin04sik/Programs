package userFunctions;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TestData.Step;
import utility.MBTPaths;

public class validateHelpLink implements userFunctionsInterface{

	 static WebDriver driver ;
	 Step step=null;
	 public static void main(String[] args) {
		 validateHelpLink var=new validateHelpLink();
	//	Step step=null;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10050725\\Desktop\\chromedriver_71-73\\chromedriver_win32\\chromedriver.exe");
	      driver = new ChromeDriver();
	      String url = "https://www.tutorialspoint.com/index.htm";
	 var.step = executeFunction(step);
	}
	public Step executeFunction(Step st) {
		// TODO Auto-generated method stub
		
		st.setActualReturnCode("0");
		String strUrl;
		try {
			
		      driver.get(url);
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		      // get current URL and print
		       strUrl = driver.getCurrentUrl();
		      System.out.println("Current Url is:"+ strUrl);
		} catch (Exception e) {
			// TODO: handle exception
			st.setActualReturnCode("-1");
            st.setActualResponse("Batch File Execution error"+e.getMessage());
		}
		 
   //     return strUrl;
		return st;
	}
  }
