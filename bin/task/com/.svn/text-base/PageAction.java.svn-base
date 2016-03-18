package task.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class PageAction {
	
	/**根据js定位元素
	 * @param dr,elementid,js
	 * 
	 */
	public static void jselement(WebDriver dr,String elementid,String js) throws InterruptedException{		
		//((JavascriptExecutor)dr).executeScript("document.getElementById('elementid').value=\"测试备注\";");
		((JavascriptExecutor)dr).executeScript(js);
		Thread.sleep(3000);
		//return js;
		
	}
	
	
	/**根据el定位元素
	 * @param dr,el
	 * 
	 */
	public static void showelement(WebDriver dr,WebElement js) throws InterruptedException{		
		
		try {
			((JavascriptExecutor) dr).executeScript("$('#js').show();");
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		Thread.sleep(3000);
	}
	
	
	
}
