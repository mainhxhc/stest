package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import task.com.BrowerAction;
import task.com.Login;

public class Bilogiin {
	private String url;
	private String jsessiond;
	private WebDriver dr;
	private Object[][] array;	
	@Test	
    public void test4()throws InterruptedException, IOException {		
		jsessiond = "ylQ3JBPDplwVNy5NbJLD2y9Q9v3fDsRG43T2TK20B31LZr7QXyn4!-1592053017";
		url = "https://130.38.18.179:6002/cas/login?service=http%3A%2F%2F130.38.18.248%3A7509%2Fnsmp%2Findex.jsp";
		dr = BrowerAction.startChrome(dr, url);
		//Login.LoginSessiond(dr,url,jsessiond);
		dr.findElement(By.xpath("//*[@id='username']")).sendKeys("59000159");
		dr.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
		dr.findElement(By.xpath("//*[@id='B1']")).click();
		dr.findElement(By.name("loginPwd")).sendKeys("123456");
		dr.findElement(By.id("submitNext")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id='menuTree']/li[32]/ul/li[1]/div")).click();
	}
    
}
