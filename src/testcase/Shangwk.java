package testcase;





import java.io.IOException;
import methods.Excel;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




import elements.sxdgPage.GoodsPage;
import elements.sxdgPage.HomePage;
import elements.sxdgPage.OrderPage;
import elements.sxdgPage.ProductListPage;




import task.com.Assertions;
import task.com.BrowerAction;
import task.com.Login;



//������
public class Shangwk {
	private String url;
	private String jsessiond;
	private WebDriver dr;
	private Object[][] array;
	 
/*	//@BeforeMethod
	@Parameters({"url","jsessiond"})	
	@Test
    public void setup(String seturl,String setjsessiond)throws InterruptedException, IOException {
		
		jsessiond = setjsessiond;
		url = seturl;
		dr = StartBrower.start(dr,url);
		Login.login(dr,url,jsessiond);
	}*/

	//@Test(dataProvider="array1",dataProviderClass = Excel.class)
	@Parameters({"url","jsessiond","excel","key"})	
	@Test
	public void test2(String seturl,String setjsessiond,String excel,String key) throws InterruptedException, IOException {
		//Thread.sleep(3000);
		
			array = Excel.readDate(excel);		
			for(int i=0;i<array.length;i++){
				
				jsessiond = setjsessiond;
				url = seturl;
				
				dr = BrowerAction.startChrome(dr, url);
				Login.LoginSessiond(dr,url,jsessiond);
				
				if(Assertions.logincheck(dr, key)){	
				
				HomePage.swk(dr).click();
				Thread.sleep(3000);
				ProductListPage.cardList(dr,Integer.parseInt((String)array[i][0])).click();
				Handle.newdr(dr, "��ϸҳ_������");
				Thread.sleep(3000);		
				GoodsPage.cardDetailsubmit(dr).click();
				Thread.sleep(3000);
				Thread.sleep(3000);
				OrderPage.idCardName(dr).sendKeys(array[i][1].toString());   //���Բ�����
				Thread.sleep(3000);
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
				dr.quit();
			}
		}
	
		dr.quit();
	}
	
	
	
}
