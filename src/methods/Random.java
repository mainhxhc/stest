package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;

import elements.sxdgPage.GoodsPage;

/**�����
 * @author Administrator
 *
 */
public class Random {
     
	 /**����1-n֮��������
	 * @param i
	 * @return
	 */

	public static int  math(int i){
		 int n = (int)(1+Math.random()*(i-1+1));
		 return n;
		 
	 }
	 
	/**�����
	 * @param dr,i,js
	 * @return
	 */
	 public static WebElement li(WebDriver dr,int t,WebElement js){
		 List<WebElement> list=GoodsPage.li(dr)	;
		 
			int n= Random.math(t);
			for(int i=0;i<list.size()-1;i++ ){
				
				if(i==n){
					js = list.get(i).findElement(By.className("pNumber"));
				System.out.println(list.get(i).findElement(By.className("pNumber")).getText());
				break;
				}
			}
			return js;
	 }
}
