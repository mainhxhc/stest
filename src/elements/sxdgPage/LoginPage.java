package elements.sxdgPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import task.com.IoAction;

public class LoginPage {
	
	public static WebElement user(WebDriver dr){			
			
			WebElement el =null;
			try {
				el = dr.findElement(By.id("mobileMsg"));
			} catch (Exception e) {
				IoAction.screenShot(dr, "");
			}	
			return el;
	}
	
	public static WebElement passd(WebDriver dr){		
		
		WebElement el =null;
		try {
			el = dr.findElement(By.id("passwordOne"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
	public static WebElement yzmMsg(WebDriver dr){		
		
		WebElement el =null;
		try {
			el = dr.findElement(By.id("vfPicOne"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
	public static WebElement loginBtn(WebDriver dr){		
		
		WebElement el =null;
		try {
			el = dr.findElement(By.id("loginBtn"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
   
	public static WebElement loginImg(WebDriver dr){		
		
		WebElement el =null;
		try {
			el = dr.findElement(By.id("loginImg"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
	
	
	
}
