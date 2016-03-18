package com.sxdg.task;

import org.openqa.selenium.WebDriver;

import com.ai.common.IoAction;
import com.sxdg.page.PayPage;

public class Alipay {
	public static void alipayout(WebDriver dr) throws InterruptedException{
		try {
			System.out.println("===========支付宝支付页面支付信息===============");
			System.out.println("商品名称：" + PayPage.alipayordername(dr));
			System.out.println("商品价格：" + PayPage.alipayorderprice(dr));
			System.out.println("商品支付有效时间：" + PayPage.alipaytime(dr));
			/*Thread.sleep(3000);
			Show.showelement(dr,OrderPage.pay(dr));
			OrderPage.pay(dr).click();	*/
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
			dr.quit();
		}
	}
	
	public static void tenpayout(WebDriver dr) throws InterruptedException{
		try {
			System.out.println("===========财付通支付页面支付信息===============");
			System.out.println("商品名称：" + PayPage.tenpayordername(dr));
			System.out.println("商品价格：" + PayPage.tenpayorderprice(dr));			
			/*Thread.sleep(3000);
			Show.showelement(dr,OrderPage.pay(dr));
			OrderPage.pay(dr).click();	*/
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
			dr.quit();
		}
	}
}
