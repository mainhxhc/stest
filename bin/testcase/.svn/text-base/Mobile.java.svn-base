package testcase;

import java.io.IOException;

import methods.Excel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import elements.sxdgPage.MobilePage;


import task.com.Assertions;
import task.com.BrowerAction;
import task.com.Login;
//ÊÖ»ú
public class Mobile {
	private String url;
	private String jsessiond;
	private WebDriver dr;
	private Object[][] array;	
	@Parameters({"url","jsessiond"})	
    public void setup(String seturl,String setjsessiond)throws InterruptedException, IOException {		
		jsessiond = setjsessiond;
		url = seturl;
		dr = BrowerAction.startChrome(dr, url);
		Login.LoginSessiond(dr,url,jsessiond);
	}

	@Parameters({"excel","key"})
	@Test
	public void test2(String excel2,String key) throws InterruptedException  {
		if(Assertions.logincheck(dr, key)){			
			array = Excel.readDate(excel2);		
			for(int i=0;i<array.length;i++){
				MobilePage.mobileList(dr, Integer.parseInt((String)array[i][0])).click();
				MobilePage.color(dr);
				

				}
			}
	}
}
