package com.ai.driver;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;




public  class IeDriver extends InternetExplorerDriver{ 
	
	
		

	public IeDriver(String url){
		this.StarBrower(url);
		
	}
	public  WebDriver StarBrower(String url){

		WebDriver wd = null;
		this.get(url);
		return wd;
		
	}


}
