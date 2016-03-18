package elements.sxdgPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import task.com.IoAction;



/**����ҳ�� d1
 * @author Administrator
 *
 */
public class OrderPage {
	
	/**����
	 * @param dr
	 * @return
	 */
	public static  WebElement idCardName(WebDriver dr){
		WebElement el = null;
		try {
			el = dr.findElement(By.xpath("//*[@id='idCardName']"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		return el;
	}
	
	/**֤����
	 * @param dr
	 * @return
	 */
	public static  WebElement idCardNo(WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.xpath("//*[@id='idCardNo']"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		return el;
	}
	
	/**��ע
	 * @param dr
	 * @return
	 */
	public static  WebElement beizhu(WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.name("selleRemark1"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		return el;
	}
	
	/**�ύ��ť
	 * @param dr
	 * @return
	 */
	public static  WebElement orderSubmit(WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.id("orderSubmit"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		return el;
	}
	
	/**���Ķ�
	 * @param dr
	 * @return
	 */
	public static  WebElement red(WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.id("networkProtocolInNet"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		return el;
	}
	public static  WebElement pay(WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.id("payBtn"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		return el;
	}
	
	
}
