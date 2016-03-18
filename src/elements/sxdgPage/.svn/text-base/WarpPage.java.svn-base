package elements.sxdgPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task.com.IoAction;




//页面顶部的菜单(例如，我的订单，个人中心)
public class WarpPage {
   //我的订单
	public static WebElement userOrder (WebDriver dr){
		
		WebElement el =null;
		try {
			el = dr.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[1]"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
}
