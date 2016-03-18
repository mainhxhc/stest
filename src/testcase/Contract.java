package testcase;

import java.io.IOException;

import methods.Excel;
import methods.Random;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import elements.sxdgPage.ContractPage;
import elements.sxdgPage.GoodsPage;
import elements.sxdgPage.OrderSuccessPage;
import elements.sxdgPage.UserOrderPage;
import elements.sxdgPage.WarpPage;





import task.Check;
import task.GetList;
import task.Handle;
import task.Login;
import task.Show;
import task.StartBrower;
import task.WebDriverWrapper;
import task.com.IoAction;
import task.sxdgtask.OrderForm;
import task.sxdgtask.Paymodes;
//宽带续约
public class Contract {

	private String url;
	private String jsessiond;
	private WebDriver dr;
	private Object[][] array;
	
	
	@Parameters({"url","jsessiond","excel"})	
	@Test
	public void test3(String excel) throws InterruptedException, IOException {
		//HomePage.kdxy(dr).click();
		array = Excel.readDate(excel);		
		for(int i=1;i<array.length+1;i++){
			jsessiond = setjsessiond;
			url = seturl;
			dr = MouseAction.start(dr,url);				
			Login.login(dr,url,jsessiond);
			
			
			GetList.divList(dr, array[i][0].toString()).click();  //选择订购的产品并点击
			 if(Check.isAlertPresent(dr)==true){ 
				 dr.switchTo().alert().accept(); 
				 WebDriverWrapper.screenShot(dr, "");
				 continue;
			 }
			 else{	
			
			Thread.sleep(300);
			//单一宽带为1
			if(array[i][1].toString().equals("1")){   
				//ContractPage.close(dr).click(); //弹出订购框的关闭
				ContractPage.closePay(dr).click(); //弹出订购框立即支付
				
				//切换句柄
				Handle.newdr(dr, "福建联通_支付接口");
				Paymodes.paymentOption(dr, array[i][2].toString()) ;//支付方式
				
				Handle.newdr(dr, "宽带续约");
				ContractPage.close(dr).click(); //弹出订购框的关闭按钮
				WarpPage.userOrder(dr).click();//跳回我的订单页面
			}
			//乐视的，为2
			if(array[i][1].toString().equals("2")){ //乐视
				Thread.sleep(3000);
				
				if(Check.logincheck(dr, "手机号码")){ //有选号码的页面
					//选套餐
					ContractPage.xuantaocan(dr).click();
					WebElement js = ContractPage.taocandiv(dr);
					Show.showelement(dr,js);
					dr.findElement(By.xpath("//*[@id='packageDiv']/div[1]/div[1]/div[1]/ul/li[1]")).click();
					
					//选号码
					ContractPage.xuanhaoma(dr).click();
					WebElement js2 = ContractPage.haomadiv(dr);
					IoAction.screenShot.showelement(dr,js2);
					Random.li(dr,5, js2).click(); 
					GoodsPage.submit(dr).click();
					ContractPage.read(dr).click();
					
				}
				
				ContractPage.leshi(dr).click();//乐视 订购			
				OrderForm.setorder(dr); //填写订单收货信息并提交				
				OrderSuccessPage.payBtn(dr).click(); //立即支付
				String nb = OrderSuccessPage.orderNumber(dr);//获取订单编号
				System.out.println("==============订单信息=================");
				System.out.println("订单编号："+nb);
				System.out.println("订单金额："+OrderSuccessPage.money(dr));
				System.out.println("订单有效时间："+OrderSuccessPage.time(dr));
				Handle.newdr(dr, "福建联通_支付接口");
				Paymodes.paymentOption(dr, array[i][2].toString()) ;//支付方式							
				Handle.newdr(dr, "我的订单_中国联通_联通商城");
				WarpPage.userOrder(dr).click();//跳回我的订单页面
				UserOrderPage.cancel(dr, nb).click();//取消订单
				Thread.sleep(3000);
				
			}
			
			
			//dr.get("http://www.10010fj.cn/ceshiweb/wo/broadBand!contractIndex.action");	
		}
			 dr.quit();
		}
		dr.quit();
	}
}
