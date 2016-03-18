package elements.sxdgPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import task.com.IoAction;


/**商品页面
 * 
 * 
 */
public class GoodsPage {
	/**选号码图标
	 * @param dr
	 * @return
	 */
	public static WebElement xuanxinhaoma (WebDriver dr){
		
		WebElement el =null;
		try {
			el = dr.findElement(By.xpath("//*[@id='choiceSvcnum']"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
	/**选号码div
	 * @param dr
	 * @return
	 */
	public static WebElement xuanhaomadiv (WebDriver dr){
		WebElement el =null ;
		try {
			el = dr.findElement(By.id("div_numSel"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
	/**选号div 地区
	 * @param dr
	 * @return
	 */	 
	public static WebElement diqu (WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.xpath("//*[@id='citySel']/option[3]']"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	/**选号div 靓号类型
	 * @param dr
	 * @return
	 */	
	public static WebElement lianghao (WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.xpath("//*[@id='citySel']/option[3]']"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
	/**选号div  预存	
	 * @param dr
	 * @return
	 */
	public static WebElement yucun (WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.xpath("//*[@id='preFeeSel']/option[1]"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
	/**选号div 搜索	
	 * @param dr
	 * @return
	 */	
	public static WebElement sousuo (WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.xpath("//*[@id='preFeeSel']/option[1]"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	/**选号div 号码
	 * @param dr
	 * @return
	 */
	public static WebElement haoma (WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.xpath("//*[@id='preFeeSel']/option[1]"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
	/**选号div 号码list
	 * @param dr
	 * @return
	 */
	public static List<WebElement> li (WebDriver dr){
		List<WebElement> list = dr.findElements(By.className("li"));	
		return list;
	}
	
	/**选号div 确定按钮
	 * @param dr
	 * @return
	 */
	public static WebElement submit (WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.className("submit-number"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}	
		return el;
	}
	
	/**选号div 立即够买按钮
	 * @param dr
	 * @return
	 */	
	public static WebElement goumaisubmit (WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.id("submit_btn_id"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		return el;
	}
	
	//wocard!getCardDetail.action
	public static WebElement cardDetailsubmit (WebDriver dr){
		WebElement el=null;
		try {
			el = dr.findElement(By.xpath("//*[@id='submitBtn']"));
		} catch (Exception e) {
			IoAction.screenShot(dr, "");
		}
		return el;
	}
}
