package elements.sxdgPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task.com.IoAction;

public class CommonEl {
	
	public static WebElement xpath (WebDriver dr,String elstr){
		
		WebElement el =null;
		try {
			el = dr.findElement(By.xpath(elstr));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
	public static WebElement id (WebDriver dr,String elstr){
		
		WebElement el =null;
		try {
			el = dr.findElement(By.id(elstr));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
	public static WebElement name (WebDriver dr,String elstr){
		
		WebElement el =null;
		try {
			el = dr.findElement(By.id(elstr));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
}
