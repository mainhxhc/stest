package com.ai.action;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import com.ai.assertions.Element;
import com.ai.common.IoAction;
import com.ai.data.EnumData.ElementType;

public class MouseAction {

	/**
	 * 输入
	 * 
	 * @param
	 * 
	 */
	public void sendKeys(WebDriver dr, ElementType et, String elementValue,
			String str, int time) {

		String i = et.toString();
		try {
			Method cc = By.class.getMethod(i, String.class);// 获取方法
			By b = (By) cc.invoke(By.class, elementValue);
			Element.WaitElement(dr, et, elementValue);
			dr.findElement(b).sendKeys(str);
		} catch (Exception e) {
			System.out.print("没有找到元素：" + elementValue);
			IoAction.screenShot(dr, "");
			dr.close();
		}

	}

	/**
	 * 鼠标左键单击
	 * 
	 * @param
	 * 
	 */
	public void click(WebDriver dr, ElementType et, String elementValue,
			int time) {
		String i = et.toString();
		try {
			Method cc = By.class.getMethod(i, String.class);// 获取方法
			By b = (By) cc.invoke(By.class, elementValue);
			Element.WaitElement(dr,et,elementValue);
			dr.findElement(b).click();
		} catch (Exception e) {
			System.out.print("没有找到元素：" + elementValue);
			IoAction.screenShot(dr, "");
			dr.close();
			
		}

	}

	/**
	 * 元素的text
	 * 
	 * @param
	 * 
	 */
	public String getText(WebDriver dr, ElementType et, String elementValue,
			 int time) {

		String i = et.toString();
		try {
			Method cc = By.class.getMethod(i, String.class);// 获取方法
			By b = (By) cc.invoke(By.class, elementValue);
			Element.WaitElement(dr, et, elementValue);
			return dr.findElement(b).getText();
		} catch (Exception e) {
			System.out.print("没有找到元素：" + elementValue);
			IoAction.screenShot(dr, "");
			dr.close();
		}
		return null;

	}
	
	
	
	
	
}
