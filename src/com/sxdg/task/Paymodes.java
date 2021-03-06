package com.sxdg.task;

import org.openqa.selenium.WebDriver;

import com.ai.assertions.Element;
import com.ai.common.IoAction;

import task.com.Assertions;
import elements.sxdgPage.PayChoicePage;

public class Paymodes {
	public static void paymentOption(WebDriver dr,String i) throws InterruptedException{
		try {
			//支付宝
			if(i.equals("z")) { 
				PayChoicePage.aliPay(dr).click();//选择支付宝确认付款
				PayChoicePage.pay(dr).click();//确认付款
				//检验支付页面跳转成功
				if(Element.Keyword(dr,"正在使用即时到账交易")){  
					Alipay.alipayout(dr);//控制台打印支付页面信息	
				}
				else {
					IoAction.screenShot(dr, "");  //支付页面跳转不成功截图
					dr.quit();
				}				
			}
			//财付通
			if(i.equals("c")){ 
				PayChoicePage.pay(dr).click();//确认付款
				if(Assertions.logincheck(dr,"本次交易为即时到账交易")){  //检验支付页面跳转成功
					Alipay.alipayout(dr);//控制台打印支付页面信息					
				}
				else {
					IoAction.screenShot(dr, "");  //支付页面跳转不成功截图
					dr.quit();
				}
			}
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
			dr.quit();
		}
	}

}
