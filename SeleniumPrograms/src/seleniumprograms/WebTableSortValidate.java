package seleniumprograms;





import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Employee;

public class WebTableSortValidate extends Employee{

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Avineesh\\Software\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("C:\\Avineesh\\htmlPages\\WebTable_Sort.html");
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		WebElement sortBtn;
				
		String sortBthXPath="//button[contains(text(),'Sort')]";
				
		sortBtn=driver.findElement(By.xpath(sortBthXPath));
				
		Assert.assertTrue(sortBtn.isDisplayed());
					
		ArrayList<Employee>empDataBeforeSort,empDataAfterSort;
		
	   System.out.println("******Before Sorting");
		
	   //method to save the unsorted data
		
		empDataBeforeSort=saveTableData(driver);
		
		
		if(sortBtn.isDisplayed())
			sortBtn.click();
		
		//driver.manage().timeouts().implicitlyWait(arg0, arg1)
		
		 System.out.println("******After Sorting");
		empDataAfterSort=saveTableData(driver);
		
		
		boolean sortingworking=false;
		
		sortingworking=validateSorting(empDataBeforeSort,empDataAfterSort);
		
		if(sortingworking==true)
		 System.out.println("Testcase *****sorting works***** Passed");
		else 
			System.out.println("Testcase *****sorting works***** Failed");
		
		boolean rowShiftsCorrcetly=false;
		
		rowShiftsCorrcetly=validateRowsShiftedCorrectly(empDataBeforeSort,empDataAfterSort);
		
		
		if(rowShiftsCorrcetly==true)
			 System.out.println("Testcase  *****row shifting works*****  Passed");
			else 
				System.out.println("Testcase   *****row shifting works***** Failed");
			
			
		
		driver.quit();
		
		
	}

	private static boolean validateSorting(ArrayList<Employee> empDataBeforeSort,
			ArrayList<Employee> empDataAfterSort) {
		// TODO Auto-generated method stub
		
		
		String[] beforeSort,afterSort;
		boolean sorting=false;
		
		afterSort= new String[empDataAfterSort.size()];
		beforeSort= new String[empDataBeforeSort.size()];
		
		for(int i=0;i<empDataAfterSort.size();i++){	
			afterSort[i]=empDataAfterSort.get(i).getName();
			//System.out.println(afterSort[i]+"");
		 }
	//	System.out.println("****before Sorting*********");
		for(int i=0;i<empDataBeforeSort.size();i++){	
			beforeSort[i]=empDataBeforeSort.get(i).getName();
			
			//System.out.println(beforeSort[i]+"");
		 }
		
		//Arrays.sort(beforeSort);
	//	Arrays.sort(afterSort);
		
		for(int i=0;i<beforeSort.length;i++){
		if(beforeSort[i].equalsIgnoreCase(afterSort[i]))
			sorting =true;
		}
		
		if(sorting==true)
			return true;
		else 
		return false;
	}
	
	
	
	private static boolean validateRowsShiftedCorrectly(ArrayList<Employee> empDataBeforeSort,
			ArrayList<Employee> empDataAfterSort) {
	
		
		String empName,empCountry;
		int empSalary;
		
		boolean sorting=false;
		for(int i=0;i<empDataAfterSort.size();i++){
			empName= empDataAfterSort.get(i).getName();
			empSalary= empDataAfterSort.get(i).getSalary();
			empCountry= empDataAfterSort.get(i).getCountry();
			
		
				if(empDataBeforeSort.get(i).getName().equals(empName)
						&&empDataBeforeSort.get(i).getSalary()==empSalary
						&&empDataBeforeSort.get(i).getCountry().equals(empCountry)){
				           	sorting =true;		 
							}
		}
		
		
		return sorting;
	}
	
	
	

	private static ArrayList<Employee> saveTableData(WebDriver driver) {
		
		//Get number of rows In table.
		List<WebElement> listOfRows,listOfCols;
		int row_count,col_count;
		String rowXpath,colXpath,cellXpath,cellValueXpath,cellValue;
		
		listOfRows=driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr"));
		row_count=listOfRows.size();
		System.out.println("Number Of Rows = "+row_count);
	
		//Get number of columns In table.
		
		listOfCols=	listOfRows.get(0).findElements(By.xpath("//table[@id='myTable']/tbody/tr/th"));	
		  col_count = listOfCols.size();
		 System.out.println("Number Of Columns = "+col_count);
	
		 //xpath for cells
		 
		 rowXpath="//table[@id='myTable']/tbody/tr[";
		 colXpath="]/td[";
		 cellXpath="]";
		 
		 ArrayList<Employee> empData= new ArrayList<Employee>();
		 Employee emp;
		 
		 for(int i=1;i<row_count;i++){
			 emp= new Employee();
			 for(int j=1;j<=col_count; j++){
				
				 cellValueXpath=rowXpath+(i+1)+colXpath+j+cellXpath;
				 cellValue=driver.findElement(By.xpath(cellValueXpath)).getText();
		//	System.out.println(cellValueXpath);
			if(j==1)
				emp.setName(cellValue);
			else if(j==2)
				emp.setSalary(Integer.parseInt(cellValue));
			else if (j==3)
				emp.setCountry(cellValue);
				// break;
			  }
			  
			 empData.add(emp);
			 
		 }
	  
		 for (int i=0; i<empData.size(); i++) {
	            System.out.println(empData.get(i)+" "); 
	            
	            System.out.println(empData.get(i).getName());
	            System.out.println(empData.get(i).getSalary());
	            System.out.println(empData.get(i).getCountry());
		 }
		 System.out.println("******************");
	   return empData;
	}
}
