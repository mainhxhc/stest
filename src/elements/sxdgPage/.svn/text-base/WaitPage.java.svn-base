package elements.sxdgPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task.com.IoAction;



public class WaitPage {
	public static WebElement weixinwok (WebDriver dr){
		WebElement el =null;
		try {
			el = dr.findElement(By
					.xpath("//*[@id='sub-ul-1']/dl[3]/dd/a[2]/span"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		//*[@id='sub-ul-1']/dl[3]/dd/a[2]/span
		return el;
		
	}
}
