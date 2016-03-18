package elements.sxdgPage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import task.com.IoAction;

public class ContractPage {
	// /html/body/div[7]/div[2]/div[2]/div[1]/div/div[2]/div[4]/input
	public static WebElement goodsList(WebDriver dr,String name){		
		WebElement goods =null;
		try {
			
			WebDriverWait wait = new WebDriverWait(dr, 30); //等等30秒
			 goods = wait.until(ExpectedConditions
					.elementToBeClickable(By
							.xpath("//*[contains(.,'name')]")));			
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}		
		return goods;
	}
	
	//弹出框订购div的关闭按钮
	public static WebElement close (WebDriver dr){
		
		WebElement el =null;
		try {
			el = dr.findElement(By.xpath("//*[@id='pay_popBox']/div[1]/span[2]"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
//立即支付	
public static WebElement closePay (WebDriver dr){
		
		/*WebElement el =null;
		try {
			Thread.sleep(10000);
			el = dr.findElement(By.xpath("//*[@id='pay_bnt']/img"));
			Thread.sleep(6000);
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	*/
	
	WebElement el =null;
	try {
		
		WebDriverWait wait = new WebDriverWait(dr, 30);
		 el = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id='pay_bnt']/img")));
		//System.out.println("11111111");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("订购按钮未出现");
		 dr.quit();

}
		
		return el;
	}
/*//支付宝确认付款
public static WebElement aliPay (WebDriver dr){
	
	WebElement el =null;
	try {
		Thread.sleep(3000);
		el = dr.findElement(By.xpath("//*[@id='alipayBankList']/div/ul/li/input"));
		Thread.sleep(3000);
	} catch (Exception e) {
		IoAction.screenShot(dr, "");
		dr.quit();
	}	
	
	return el;
}
//确认付款/html/body/div[5]/div[3]/a/img
public static WebElement pay (WebDriver dr){
	
	WebElement el =null;
	try {
		Thread.sleep(3000);
		el = dr.findElement(By.xpath("/html/body/div[5]/div[3]/a/img"));
		
	} catch (Exception e) {
		IoAction.screenShot(dr, "");
		dr.quit();
	}	
	
	return el;
}*/
	// 乐视的订购按钮
	public static WebElement leshi (WebDriver dr){
		
		WebElement el =null;
		try {                             
			el = dr.findElement(By.xpath("//*[@id='submit_btn_id']"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	// 选套餐
	public static WebElement xuantaocan (WebDriver dr){
		
		WebElement el =null;
		try {
			el = dr.findElement(By.xpath("//*[@id='packageChoose']"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	// 选号码
	public static WebElement xuanhaoma (WebDriver dr){
		
		WebElement el =null;
		try {
			el = dr.findElement(By.xpath("//*[@id='numberChoose']"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
	
	
	/**选套餐div
	 * @param dr
	 * @return
	 */	 
	public static WebElement taocandiv (WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.xpath("//*[@id='div_PackageSel']"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	/**选号码div
	 * @param dr
	 * @return
	 */	 
	public static WebElement haomadiv (WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.xpath("//*[@id='div_PackageSel']"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
	//我同意
	public static WebElement read (WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.xpath("//*[@id='readItem']"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
	

}
