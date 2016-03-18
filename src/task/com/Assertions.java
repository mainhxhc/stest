package task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Assertions {
	
	/**判断页面是否包含某关键字
	 * @param dr,key
	 * @return Boolean
	 */
	public static Boolean  logincheck(WebDriver dr,String key ) {
		Boolean status 	;		
		WebDriverWait wait = new WebDriverWait(dr,5);			
//		验证是否登陆成功。用wait方法。wait方法除了在验证页面是否存在文字中使用，也用于多层加载页面的元素定位
		try { 
			Thread.sleep(3000);
			WebElement test = wait.until(ExpectedConditions.elementToBeClickable(By
					.xpath("//*[contains(.,'key')]")));    //xpath的一个contains（包含）的方法 ，固定写法
			status = true;
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("============没有找到["+key+"]关键字");
			IoAction.screenShot(dr, "");
			status = false;
		}
		return status;		
	}
	
	/**判断是否有有弹出框
	 * @param dr
	 * @return Boolean
	 */
	 public static boolean isAlertPresent(WebDriver dr) { 
		 try { 
				 dr.switchTo().alert(); 
				 return true; 
			 } catch (NoAlertPresentException Ex) {
				 return false;
			 } 
	 } 
}
