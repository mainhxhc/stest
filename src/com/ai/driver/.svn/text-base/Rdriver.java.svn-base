package com.ai.driver;


import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.ai.data.EnumData.BrowerType;



public class Rdriver  { 

	DesiredCapabilities test = null;
	
public   Rdriver(BrowerType browser,String nodeUrl) throws InstantiationException, InterruptedException{
		
		switch(browser)
			{
			case IE:
				//test=DesiredCapabilities.internetExplorer();
				this.IeDriver(nodeUrl);
				break;
			case CHROME:
				//test=DesiredCapabilities.chrome();
				this.ChromeDriver(nodeUrl);
				break;
			case FIREFOX:
				//test=DesiredCapabilities.firefox();
				this.FirefoxDriver(nodeUrl);
				break;
			}	
	}


	
	public  void ChromeDriver(String nodeUrl){
		test=DesiredCapabilities.internetExplorer();
		this.Start(nodeUrl);
		
	}
	
	public void IeDriver(String nodeUrl){
		test=DesiredCapabilities.internetExplorer();	
		this.Start(nodeUrl);
		
	}
	
	public void FirefoxDriver(String nodeUrl){
		test=DesiredCapabilities.firefox();
		this.Start(nodeUrl);
		
	}
	
	public WebDriver Start(String nodeUrl){
		String url2 = nodeUrl+"/wd/hub";
		URL urlinstance = null;
		try {
			urlinstance = new URL(url2);
		} catch (MalformedURLException e) {
			System.out.println("=========Ô¶³ÌÊµÀýurl´íÎó¡£==========");
		}		
		WebDriver dr = new RemoteWebDriver(urlinstance,test);
		return dr;	
	}
}



		
		
	


