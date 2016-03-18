package com.sxdg;

import java.util.List;

import methods.Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import com.ai.assertions.Page;
import com.ai.common.IoAction;
import com.ai.data.EnumData.BrowerType;
import com.ai.data.EnumData.ElementType;
import com.ai.driver.DriverService;
import com.sxdg.page.PayChoicePage;
import com.sxdg.task.Paymodes;

public class Ttest {

	private Object[][] array;
	ElementType et = null;
	ElementType xpath = ElementType.xpath;
	ElementType id = ElementType.id;
	ElementType name = ElementType.name;

	@Parameters({ "excel" })
	@Test
	public void test4(String excel) throws Exception {

		// SessionInfo.getCheckCode(ServletActionContext.getRequest()));

		array = IoAction.readExcelDate(excel); // 获取excel
		for (int i = 1; i < array.length; i++) {
			DriverService dr = new DriverService();

			dr.startBrower(BrowerType.CHROME,
					"http://www.10010fj.cn/wo/broadBand!loginIndex.action");
			JavascriptExecutor jse = (JavascriptExecutor) dr.getDr();
			jse.executeScript("document.getElementById('subNav2').style.display = 'block'");
			jse.executeScript("document.getElementById('subNav1').style.display = 'none'");
			dr.sendKeys(xpath, "//*[@id='subNav2']/div[3]/dl[1]/dd/input",
					array[i][0].toString());
			dr.sendKeys(xpath, "//*[@id='subNav2']/div[3]/dl[2]/dd/input",
					array[i][1].toString());
			Thread.sleep(6000);
			dr.click(xpath, "//*[@id='loginBnt']");
			Thread.sleep(3000);
			if (dr.getDr().findElement(By.xpath("//*[@id='div_numSel']")) // 一个身份证号码挂接多个宽带号
					.isDisplayed()) {
				List<WebElement> lists = dr.getDr()
						.findElement(By.id("svcNumberList"))
						.findElements(By.tagName("ul"));

				for (int x = 0, j = 1; x < lists.size(); x++, j++) {
					System.out.println(j + "=========1111111111");
					String value = dr
							.getDr()
							.findElement(
									By.xpath("//*[@id='svcNumberList']/ul[" + j
											+ "]/li/div/input"))
							.getAttribute("value");
					System.out.println("value============" + value);
					System.out.println("测试宽带号============"
							+ array[i][2].toString());

					if (value.equals(array[i][2].toString())) { // 选中宽带号和测试数据一致的记录
						System.out.println("一致");
						dr.click(xpath, "//*[@id='svcNumberList']/ul[" + j
								+ "]/li/div/input");
						System.out
								.println("是否选中 ======="
										+ dr.getDr()
												.findElement(
														By.xpath("//*[@id='svcNumberList']/ul["
																+ j
																+ "]/li/div/input"))
												.isDisplayed());
						// break是跳出内循环,继续执行外循环,而continue是结束本次循环
						continue;
					}

				}
				dr.click(xpath, "//*[@id='div_numSel']/div[2]/div[3]/a"); // 点击确定按钮
				Thread.sleep(5000);
				
			}
			if (dr.keyword("欢迎来到福建联通沃商城")) {
				String goods =array[i][3].toString();
				List<WebElement> div = dr.cssList("checkbox");
			    for (int b=1;b<=div.size();b++){
			    	if(dr.getDr().findElement(By.xpath("/html/body/div[7]/div[2]/div[2]/div["+b+"]/div/div[2]/div[1]")).getText().contains(goods)){
			    		dr.getDr().findElement(By.xpath("/html/body/div[7]/div[2]/div[2]/div["+b+"]/div/div[2]/div[4]/input")).click();
			    		dr.getDr().findElement(By.xpath("/html/body/div[7]/div[2]/div[2]/div["+b+"]/div/div[2]/div[3]/a")).click();
			    		continue;  //跳出循环
			    										
			    	}
					
			}
			     
			} else {
				System.out.print("没有进入列表页面，关闭浏览器");
				//dr.getDr().close();

			}
			Thread.sleep(10000);			
			dr.waitElement(xpath, "//*[@id='pay_bnt']/img",60).click();
			Thread.sleep(3000);				
			dr.newdr(dr.getDr(),"福建联通_支付接口");//选择支付方式页面			
			PayChoicePage.aliPay(dr);
			/*if(array[i][4].toString().ge)   //验证产品价格
			if(array[i][4].toString().equals(dr.getText(xpath, "//*[@id='order']/div[1]/div[2]/span[1]"))){
				//*[@id="J_basePriceArea"]/strong
				if  
			}*/
			
			System.out.println(""+dr.getText(xpath, ""));
			System.out.println(""+dr.getText(xpath, ""));
			//dr.click(xpath, "//*[@id='alipayBankList']/div/ul/li/input");//选择支付宝
			//dr.click(xpath, "/html/body/div[5]/div[3]/a/img");//确定支付
			
			
		}
	}
}
