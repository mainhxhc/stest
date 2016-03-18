package task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Assertions {
	
	/**�ж�ҳ���Ƿ����ĳ�ؼ���
	 * @param dr,key
	 * @return Boolean
	 */
	public static Boolean  logincheck(WebDriver dr,String key ) {
		Boolean status 	;		
		WebDriverWait wait = new WebDriverWait(dr,5);			
//		��֤�Ƿ��½�ɹ�����wait������wait������������֤ҳ���Ƿ����������ʹ�ã�Ҳ���ڶ�����ҳ���Ԫ�ض�λ
		try { 
			Thread.sleep(3000);
			WebElement test = wait.until(ExpectedConditions.elementToBeClickable(By
					.xpath("//*[contains(.,'key')]")));    //xpath��һ��contains���������ķ��� ���̶�д��
			status = true;
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("============û���ҵ�["+key+"]�ؼ���");
			IoAction.screenShot(dr, "");
			status = false;
		}
		return status;		
	}
	
	/**�ж��Ƿ����е�����
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