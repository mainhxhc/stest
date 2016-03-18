package elements.sxdgPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task.com.IoAction;

/**订单页面 d2
 * @author Administrator
 *
 */
public class OrderSuccessPage {
	
	//立即支付
	public static WebElement payBtn (WebDriver dr){
		
		WebElement el =null;
		try {
			Thread.sleep(10000);
			el = dr.findElement(By.xpath("//*[@id='payBtn']"));
			Thread.sleep(6000);
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		
		return el;
	}
	
	//获取订单编号
	public static String orderNumber (WebDriver dr){
	String nb = dr.findElement(By.xpath("//*[@id='content']/div/div/div[2]/b")).getText();	
	return nb;
	}
	
	//获取订单金额
	public static String money (WebDriver dr){
	String money = dr.findElement(By.xpath("//*[@id='content']/div/div/div[4]/span")).getText();	
	return money;
	}
	
	//获取订单时间
	public static String time (WebDriver dr){
	String time = dr.findElement(By.xpath("//*[@id='remainingTime']")).getText();	
	return time;
	}
	
	
	
}
