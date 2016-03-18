package com.sxdg.page;


import com.ai.data.EnumData.ElementType;
import com.ai.driver.DriverService;

//选择支付方式页面P1
public class PayChoicePage {
	static ElementType et = null;
	static ElementType xpath = ElementType.xpath;
	static ElementType id = ElementType.id;
	static ElementType name = ElementType.name;
	
	//选择支付宝
	public  static void aliPay (DriverService dr){
		
		dr.click(xpath, "//*[@id='alipayBankList']/div/ul/li/input");
		dr.click(xpath,"/html/body/div[5]/div[3]/a/img");
	}
	//选择财付通
	public static void tenPay (DriverService dr){
		
			dr.click(xpath, "//*[@id='J-chooseBankList']/li[21]/label");
			dr.click(xpath,"/html/body/div[5]/div[3]/a/img");
	}
	
	
	//选择工行
	public static void icbcPay (DriverService dr){
		
		dr.click(xpath, "//*[@id='J-chooseBankList']/li[1]/label");
		dr.click(xpath,"/html/body/div[5]/div[3]/a/img");
	
	}
	
	
	/*//确认付款
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
}
