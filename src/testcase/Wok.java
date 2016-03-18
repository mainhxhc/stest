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
//�ֿ�
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
				ProductListPage.product(dr, Integer.parseInt((String) array[i][0])).click();  //������2 ��ѡ�ڼ�����Ʒ��
				//Thread.sleep(3000);
				Handle.newdr(dr, "��ϸҳ_����");
				Thread.sleep(3000);
				//ѡ����
				GoodsPage.xuanxinhaoma(dr).click();
				WebElement js = GoodsPage.xuanhaomadiv(dr);
				Show.showelement(dr,js);
				Random.li(dr, Integer.parseInt((String) array[i][1]), js).click();    //������li��ѡ���룩
				GoodsPage.submit(dr).click();	
				Thread.sleep(3000);
				Show.showelement(dr,GoodsPage.goumaisubmit(dr));
				Thread.sleep(3000);
				GoodsPage.goumaisubmit(dr).click();
				Thread.sleep(3000);
				OrderPage.idCardName(dr).sendKeys(array[i][2].toString());   //���Բ�����  (֤����)
				OrderPage.idCardNo(dr).sendKeys("210602198302114048");
				Thread.sleep(3000);
				((JavascriptExecutor)dr).executeScript("document.getElementById('selleRemark1').value=\"���Ա�ע\";");
				OrderPage.red(dr).click();
				Thread.sleep(3000);
				OrderPage.orderSubmit(dr).click();
				Thread.sleep(3000);
				Show.showelement(dr,OrderPage.pay(dr));
				OrderPage.pay(dr).click();	
				Thread.sleep(3000);
				Handle.newdr(dr, "������ͨ_֧���ӿ�");
				Thread.sleep(3000);
				dr.findElement(By.xpath("/html/body/div[4]/div[2]/div/ul/li[1]/a")).click();  //��ҳ
				Thread.sleep(3000);
				
			}
		}
	
		
	}
}	
	
	
//}
