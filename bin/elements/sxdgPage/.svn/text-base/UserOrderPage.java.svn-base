package elements.sxdgPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task.com.IoAction;



public class UserOrderPage {
	//取消订单
	public static WebElement cancel (WebDriver dr,String nb){
		WebElement el =null;
		try {
			 dr.findElement(By.xpath("//*[@id='payCancle_"+nb+"']")).click();  //点击取消按钮
			 Thread.sleep(3000);
			 el = dr.findElement(By.xpath("//*[@id='cancelBtn']"));  //确定取消
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		
		return el;		
	}
	
	
	//剩余时间
	//*[@id="remainingTime_3131"]
	public static WebElement time (WebDriver dr,String nb){
		WebElement el =null;
		try {
			 dr.findElement(By.xpath("//*[@id='remainingTime_"+nb+"']"));  //点击取消按钮
	
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		
		return el;		
	}
}
