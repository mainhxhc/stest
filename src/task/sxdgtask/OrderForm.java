package task.sxdgtask;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import elements.sxdgPage.OrderPage;

public class OrderForm {
	//��д�����ջ���Ϣ
	public static void setorder(WebDriver dr) throws InterruptedException{
		OrderPage.idCardName(dr).sendKeys("����");   //���Բ�����  (֤����)
		OrderPage.idCardNo(dr).sendKeys("210602198302114048");
		Thread.sleep(3000);
		((JavascriptExecutor)dr).executeScript("document.getElementById('selleRemark1').value=\"���Ա�ע\";");
		OrderPage.red(dr).click();
		Thread.sleep(3000);
		OrderPage.orderSubmit(dr).click();
		/*Thread.sleep(3000);
		Show.showelement(dr,OrderPage.pay(dr));
		OrderPage.pay(dr).click();	*/
	}
}