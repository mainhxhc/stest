package elements.sxdgPage;

import methods.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task.com.IoAction;



public class MobilePage {
	public static WebElement mobileList (WebDriver dr,int i){
		WebElement el=null;
		try {//*[@id="chseNums"]/ul/li[1]/a[1]/img
			el = dr.findElement(By.xpath("//*[@id='chseNums']/ul/li[1]/a["+i+"]/img"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		
		return el;
	}
	
	//ÑÕÉ«
	
	public static WebElement color (WebDriver dr){
		WebElement el=null;
		Random random =null;
		int i= random.math(3);
		try {
			el = dr.findElement(By.xpath("/html/body/div[7]/div[2]/div[2]/dl[5]/dd/a["+i+"]"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		
		return el;
	}
	
	public static WebElement xuanxinhaoma (WebDriver dr){
		
		WebElement el =null;
		try {
			el = dr.findElement(By.xpath("//*[@id='numName']"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
}
