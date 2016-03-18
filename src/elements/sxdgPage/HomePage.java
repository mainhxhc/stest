package elements.sxdgPage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import task.com.IoAction;


public class HomePage {
	//ö¦ºÅ Ì×²Í¿é
	public static WebElement wk(WebDriver dr){		
		WebElement wok = null;
		try {
			wok=dr.findElement(By.xpath("//*[@id='mainCate-1']"));		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			IoAction.screenShot(dr, "");
			//e.printStackTrace();
		} 
		
		return wok;
	}
	
	//ÊÖ»ú¿é
	public static WebElement cfsj(WebDriver dr){		
		WebElement cfsj = null;
		try {
			cfsj = dr.findElement(By.xpath("//*[@id='mainCate-2']"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}		
		return cfsj;
	}
	
	//*[@id="mainCate-3"]/h3/a
	public static WebElement swk(WebDriver dr){		
		WebElement swk =null;
		try {
			swk = dr.findElement(By.xpath("//*[@id='mainCate-3']/h3/a"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}		
		return swk;
	}
	
	
	public static WebElement kdxy(WebDriver dr){		
		WebElement kdxy =null;
		try {
			kdxy = dr.findElement(By.xpath("//*[@id='mainCate-4']/p/a[1]"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}		
		return kdxy;
	}
}
