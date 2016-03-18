package testcase;





import java.io.IOException;


import methods.Excel;
import methods.Random;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import elements.sxdgPage.GoodsPage;
import elements.sxdgPage.HomePage;
import elements.sxdgPage.OrderPage;
import elements.sxdgPage.ProductListPage;
import elements.sxdgPage.WaitPage;
import task.Check;
import task.Login;
import task.Handle;
import task.Show;
import task.StartBrower;

import task.Wait;

@Test
//沃卡
public class Wok {
	private String url;
	private String jsessiond;
	private WebDriver dr;
	private Object[][] array;	
	
	
	

	
	@Parameters({"url","jsessiond"})	
    public void setup(String seturl,String setjsessiond)throws InterruptedException, IOException {
		
		jsessiond = setjsessiond;
		url = seturl;
		dr = MouseAction.start(dr,url);
		Login.login(dr,url,jsessiond);
		

	}

	@Parameters({"excel","key"})
	@Test
	public void test2(String excel2,String key) throws InterruptedException  {
		if(Check.logincheck(dr, key)){			
			array = Excel.readDate(excel2);		
			for(int i=0;i<array.length;i++){				
				Wait.wait(dr, HomePage.wk(dr));
				WaitPage.weixinwok(dr).click();;				
				ProductListPage.product(dr, Integer.parseInt((String) array[i][0])).click();  //参数化2 （选第几个商品）
				//Thread.sleep(3000);
				Handle.newdr(dr, "详细页_号码");
				Thread.sleep(3000);
				//选号码
				GoodsPage.xuanxinhaoma(dr).click();
				WebElement js = GoodsPage.xuanhaomadiv(dr);
				Show.showelement(dr,js);
				Random.li(dr, Integer.parseInt((String) array[i][1]), js).click();    //参数化li（选号码）
				GoodsPage.submit(dr).click();	
				Thread.sleep(3000);
				Show.showelement(dr,GoodsPage.goumaisubmit(dr));
				Thread.sleep(3000);
				GoodsPage.goumaisubmit(dr).click();
				Thread.sleep(3000);
				OrderPage.idCardName(dr).sendKeys(array[i][2].toString());   //测试参数化  (证件明)
				OrderPage.idCardNo(dr).sendKeys("210602198302114048");
				Thread.sleep(3000);
				((JavascriptExecutor)dr).executeScript("document.getElementById('selleRemark1').value=\"测试备注\";");
				OrderPage.red(dr).click();
				Thread.sleep(3000);
				OrderPage.orderSubmit(dr).click();
				Thread.sleep(3000);
				Show.showelement(dr,OrderPage.pay(dr));
				OrderPage.pay(dr).click();	
				Thread.sleep(3000);
				Handle.newdr(dr, "福建联通_支付接口");
				Thread.sleep(3000);
				dr.findElement(By.xpath("/html/body/div[4]/div[2]/div/ul/li[1]/a")).click();  //首页
				Thread.sleep(3000);
				
			}
		}
	
		
	}
}	
	
	
//}
