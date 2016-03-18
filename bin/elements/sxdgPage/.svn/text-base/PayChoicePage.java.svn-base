package elements.sxdgPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task.com.IoAction;

//选择支付方式P1
public class PayChoicePage {
	//选择支付宝
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
	//选择财付通
	public static WebElement tenPay (WebDriver dr){
		
		WebElement el =null;
		try {
			Thread.sleep(3000);
			el = dr.findElement(By.xpath("//*[@id='J-chooseBankList']/li[21]/label"));
			Thread.sleep(3000);
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
			dr.quit();
		}	
		
		return el;
	}
	
	
	//选择工行
	public static WebElement icbcPay (WebDriver dr){
		
		WebElement el =null;
		try {
			Thread.sleep(3000);
			el = dr.findElement(By.xpath("//*[@id='J-chooseBankList']/li[1]/label"));
			Thread.sleep(3000);
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
			dr.quit();
		}	
		
		return el;
	}
	
	
	//确认付款
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
	}
}
