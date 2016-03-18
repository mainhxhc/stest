package com.ai.assertions;



import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Page {
	/**判断是否有有弹出框
	 * @param dr
	 * @return Boolean
	 */
	 public static boolean isAlertPresent(WebDriver dr) { 
		 try { 
				 dr.switchTo().alert(); 
				 return true; 
			 } catch (NoAlertPresentException Ex) {
				 return false;
			 } 
	 } 
	 
	 
	
}
