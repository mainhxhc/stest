package com.ai.driver;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.ai.action.MouseAction;
import com.ai.assertions.Element;

import com.ai.common.IoAction;
import com.ai.common.LoginSession;
import com.ai.data.EnumData.BrowerType;
import com.ai.data.EnumData.ElementType;
import com.ai.elements.Elements;

public class DriverService {

	private WebDriver dr = null;
	MouseAction action = new MouseAction();

	// 启动浏览器
	public WebDriver startBrower(BrowerType bType, String url) {
		switch (bType) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver",
					DriverOptions.chromeDriverPath);
			dr = new Cdriver(url);
			break;
		case FIREFOX:
			dr = new FirefoxDriver();
			dr.get(url);
			break;
		case IE:
			System.setProperty("webdriver.ie.driver",
					DriverOptions.IeDriverPath);
			dr = new IeDriver(url);
			break;
		case REMOTE:
			// WebDriver
			try {
				dr = (WebDriver) new Rdriver(bType, url);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		return dr;
	}

	public WebDriver getDr() {
		return dr;
	}

	// 点击
	public void click(ElementType et, String elementValue, int time) {
		action.click(dr, et, elementValue, time);

	}

	public void click(ElementType et, String elementValue) {
		this.click(et, elementValue, 3);

	}

	// 输入
	public void sendKeys(ElementType et, String elementValue, String str,
			int time) {
		// MouseAction action = new MouseAction();
		action.sendKeys(dr, et, elementValue, str, time);
	}

	public void sendKeys(ElementType et, String elementValue, String str) {
		// MouseAction action = new MouseAction();
		this.sendKeys(et, elementValue, str, 3);

	}
	
	// 获取text
		public String getText(ElementType et, String elementValue,
				int time) {
			// MouseAction action = new MouseAction();
			return action.getText(dr, et, elementValue,  time);
		}
		public String getText(ElementType et, String elementValue) {
			// MouseAction action = new MouseAction();
			return this.getText(et, elementValue, 3);

		}
	
	
	

	/**
	 * 窗口切换
	 * 
	 * @param dr
	 *            ,windowTitle
	 * @return dr
	 */
	public WebDriver newdr(WebDriver dn,String windowTitle) {
		String currentHandle = dn.getWindowHandle(); // 获取当前窗口句柄
		Set<String> handles = dn.getWindowHandles(); // 获取所有窗口句柄
		try {

			for (String s2 : handles) {
				Thread.sleep(3000); // 获取新窗口句柄时，需要增加延时，防止由于打开新窗口 句柄还没出来就去找了
				if (s2.equals(currentHandle))
					continue;
				else {
					dn.switchTo().window(s2);
					if (dn.getTitle().contains(windowTitle)) {
						dn.switchTo().window(s2);
			
						break;
					} else
						
						continue;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("获取新窗口失败");
		}
		
		return dn;

	}

	public WebDriver sessionLogin(String url, String jsessiond) {

		return LoginSession.Sessiond(dr, url, jsessiond);
	}

	public String elementPicker(WebElement et, String attribute)
			throws IOException, InterruptedException {
		Boolean b = Element.etisnull(dr, et, attribute);
		if (b) {
			BufferedImage inputbig = IoAction.createElementImage(dr, et);
			Thread.sleep(3000);
			ImageIO.write(inputbig, "jpg", new File("c://71.jpg")); // 保存验证码图片
		}

		Thread.sleep(10000);
		Runtime.getRuntime().exec("cmd.exe /c start c:\\test.bat");
		Thread.sleep(30000);
		String filePath = "c:\\test.txt";
		String read = IoAction.readTxtFile(filePath);// 读取文件内容
		return read;
	}
	
	public List<WebElement> cssList (String inputType){
		return Elements.cssList(dr,inputType);
	}
	
	public Boolean keyword(String key){
		return Element.Keyword(dr, key);
		
	}
	
	public WebElement waitElement(ElementType et,String value,long time) throws IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		try {
			return Element.WaitElement(dr, et, value,time);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}
	public WebElement waitElement(ElementType et,String value) throws IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		try {
			return Element.WaitElement(dr, et, value,30);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}
	
}