package com.ai.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ai.data.EnumData.ElementType;




public class Elements {

	
	public static List<WebElement> cssList (WebDriver dr,String inputType){
		List<WebElement>   inputTypes= dr.findElements(By.cssSelector("input[type="+inputType+"]"));
		return inputTypes;
		
	}
	
	
	
	/*//获取checkbox的list，根据name定位到具体元素
		public static WebElement  checkboxList(WebDriver dr,ElementType et,String elementValue,String name ) throws InterruptedException {
			WebElement buy = null;
			String e = et.toString();
			List<WebElement>  checkboxList = dr.findElements(By.cssSelector("input[type=checkbox]"));
			Method cc = By.class.getMethod(e,String.class);// 获取方法
			By b = (By) cc.invoke(By.class, elementValue);
			Thread.sleep(3000);
		    
			for(WebElement checkbox : checkboxList){
				checkboxList.get(checkboxList.size()-1).f
			}

			
			
			
			for (int i=1;i<=div.size();i++){
		    	if(dr.findElement(b).getText().contains(name)){
		    		dr.findElement(By.xpath("/html/body/div[7]/div[2]/div[2]/div["+i+"]/div/div[2]/div[4]/input")).click();
		    		buy = dr.findElement(By.xpath("/html/body/div[7]/div[2]/div[2]/div["+i+"]/div/div[2]/div[3]/a"));
		    		return buy;
		    	}
				
		}
			return buy;
		}*/
	
	
	
	
	
	
	
}
