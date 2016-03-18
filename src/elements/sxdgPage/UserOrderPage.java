package elements.sxdgPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task.com.IoAction;



public class UserOrderPage {
	//ȡ������
	public static WebElement cancel (WebDriver dr,String nb){
		WebElement el =null;
		try {
			 dr.findElement(By.xpath("//*[@id='payCancle_"+nb+"']")).click();  //���ȡ����ť
			 Thread.sleep(3000);
			 el = dr.findElement(By.xpath("//*[@id='cancelBtn']"));  //ȷ��ȡ��
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		
		return el;		
	}
	
	
	//ʣ��ʱ��
	//*[@id="remainingTime_3131"]
	public static WebElement time (WebDriver dr,String nb){
		WebElement el =null;
		try {
			 dr.findElement(By.xpath("//*[@id='remainingTime_"+nb+"']"));  //���ȡ����ť
	
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		
		return el;		
	}
}
