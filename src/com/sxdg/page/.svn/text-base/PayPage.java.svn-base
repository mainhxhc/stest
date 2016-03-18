package com.sxdg.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ai.common.IoAction;

//支付宝交易倒计时
public class PayPage {
	//支付时间   //*[@id="teOrderDelayText"]
	public static String alipaytime (WebDriver dr){
		
		String alipaytime = null;
		try {
			alipaytime = dr.findElement(By.xpath("//*[@id='teOrderDelayText']")).getText();
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return alipaytime;
	}
	
	//商品名称
	public static String alipayordername (WebDriver dr){
		
		String alipayordername = null;
		try {
			alipayordername = dr.findElement(By.xpath("//*[@id='order']/div[1]/div[2]/span[1]")).getText();
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return alipayordername;
	}
	
	
	//商品价格
	public static String alipayorderprice (WebDriver dr){
		
		String alipayorderprice = null;
		try {
			alipayorderprice = dr.findElement(By.xpath("//*[@id='J_basePriceArea']/strong")).getText();
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return alipayorderprice;
	}
	
	//财付通

	
	//商品名称
	public static String tenpayordername (WebDriver dr){
		
		String alipayordername = null;
		try {                                         
			alipayordername = dr.findElement(By.xpath("//*[@id='yui_3_2_0_3_1419326451987227']")).getText();
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return alipayordername;
	}
	
	
	//商品价格
	public static String tenpayorderprice (WebDriver dr){
		
		String alipayorderprice = null;
		try {
			alipayorderprice = dr.findElement(By.xpath("//*[@id='total_fee_show']")).getText();
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return alipayorderprice;
	}
	
}
