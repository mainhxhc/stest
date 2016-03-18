package com.ai.assertions;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import com.ai.data.EnumData.ElementType;

import com.ai.common.IoAction;

public class Element {

	/**判断页面是否包含某关键字
	 * @param 
	 * @return Boolean
	 */
	public static Boolean  Keyword(WebDriver dr,String key ) {
		Boolean status 	;		
		WebDriverWait wait = new WebDriverWait(dr,10);			

		try { 
			Thread.sleep(3000);
			WebElement test = wait.until(ExpectedConditions.elementToBeClickable(By
					.xpath("//*[contains(.,'"+key+"')]")));    //xpath的一个contains（包含）的方法 ，固定写法
			status = true;
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("============没有找到["+key+"]关键字");
			IoAction.screenShot(dr, "");
			status = false;
		}
		return status;		
	}
	
	
	 public  static WebElement WaitElement(WebDriver dr,ElementType et,String elementValue,long time) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		 String i = et.toString();
		 Method cc = By.class.getMethod(i, String.class);//获取方法
		 By b = (By) cc.invoke(By.class, elementValue);
		 
		 WebDriverWait wait = new WebDriverWait(dr, time); //等等30秒
			WebElement el
			 = wait.until(ExpectedConditions.elementToBeClickable(b));
			return el;		 
		 } 
	 
	 public  static WebElement WaitElement(WebDriver dr,ElementType et,String elementValue) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		 
			return WaitElement(dr,et,elementValue,30);		 
		 }
	 
	 
	 public static Boolean etisnull(WebDriver dr,WebElement et,String attribute) throws IOException, InterruptedException{
		 if(et!=null){  	                 
             String src =  et.getAttribute(attribute);
            
              if(src!=null && !"".equals(src)){  
                
				return true;  	                 
         
             }  	                 
          }
		return false; 
		 
	 }
	 
	 
	 
	
//	public  static WebElement WaitXpath(WebDriver dr,String elementValue, int time){
//		WebDriverWait wait = new WebDriverWait(dr, time); //等等30秒
//		WebElement el
//		 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementValue)));
//		return el;		 
//	 }
//	 
//	 public  static WebElement WaitName(WebDriver dr,String elementValue, int time){
//			WebDriverWait wait = new WebDriverWait(dr, time); //等等30秒
//			WebElement el
//			 = wait.until(ExpectedConditions.elementToBeClickable(By.name(elementValue)));
//			return el;		 
//	}
//	 
//	 public  static WebElement WaitId(WebDriver dr,String elementValue, int time){
//			WebDriverWait wait = new WebDriverWait(dr, time); //等等30秒
//			WebElement el
//			 = wait.until(ExpectedConditions.elementToBeClickable(By.id(elementValue)));
//			return el;
//	}
//	 
//	 public  static WebElement WaitLinkText(WebDriver dr,String elementValue, int time){
//			WebDriverWait wait = new WebDriverWait(dr, time); //等等30秒
//			WebElement el
//			 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(elementValue)));
//			return el;
//	}
//	 public  static WebElement WaitTagName(WebDriver dr,String elementValue, int time){
//			WebDriverWait wait = new WebDriverWait(dr, time); //等等30秒
//			WebElement el
//			 = wait.until(ExpectedConditions.elementToBeClickable(By.tagName(elementValue)));
//			return el;
//	}
//	 
//	 public  static WebElement WaitPartialLinkText(WebDriver dr,String elementValue, int time){
//			WebDriverWait wait = new WebDriverWait(dr, time); //等等30秒
//			WebElement el
//			 = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(elementValue)));
//			return el;
//	}
	 
	 
	 
	 
	 
	 
	 
	 
	 /*	 
	 WebDriverWait wait = new WebDriverWait(dr, time); //等等30秒
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementValue)));*/
}
