package elements.sxdgPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task.com.IoAction;



public class KdxyLogin {

	
	//身份证登陆
	public static WebElement sfzlogin(WebDriver dr){		
		WebElement sfzlogin = null;
		try {
			sfzlogin=dr.findElement(By.xpath("//*[@id='subNav2']/div[1]/ul/li[2]/a"));		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			IoAction.screenShot(dr, "");
			//e.printStackTrace();
		} 
		
		return sfzlogin;
	}
   
	//身份证
	public static WebElement sfz(WebDriver dr){		
		WebElement sfz = null;
		try {
			sfz=dr.findElement(By.xpath("//*[@id='subNav2']/div[3]/dl[1]/dd/input"));		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			IoAction.screenShot(dr, "");
			//e.printStackTrace();
		} 
		
		return sfz;
	}
	//用户名
	public static WebElement yhm(WebDriver dr){		
		WebElement yhm = null;
		try {
			yhm=dr.findElement(By.xpath("//*[@id='subNav2']/div[3]/dl[2]/dd/input"));		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			IoAction.screenShot(dr, "");
			//e.printStackTrace();
		} 
		
		return yhm;
	}

}
