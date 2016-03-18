package elements.sxdgPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task.com.IoAction;


public class ProductListPage {
	//*[@id="goodsList"]/ul/li[2]/a/img
	public static WebElement product (WebDriver dr,int i){
		WebElement el=null;
		try {
			el = dr.findElement(By.xpath("//*[@id='goodsList']/ul/li[" + i
					+ "]/a/img"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		//*[@id='sub-ul-1']/dl[3]/dd/a[2]/span
		return el;
	}
	
	//wocard!cardList.action
	public static WebElement cardList (WebDriver dr,int i){
		WebElement el=null;
		try {
			el = dr.findElement(By.xpath("//*[@id='goodsList']/ul/li[" + i
					+ "]/a/img"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		
		return el;
	}
}
