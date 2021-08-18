package com.ems.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil {

   public static long PAGE_LOAD_TIMEOUT=20;
   public static long IMPLICIT_WAIT=15;
   
   
   
   public static void webElementWait(WebDriver driver,String xpath){
	   System.out.println("#######Inside wait method");
	   WebDriverWait wait=new WebDriverWait(driver, 20);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
   }
}
