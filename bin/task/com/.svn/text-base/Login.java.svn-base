package task.com;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class Login {
	
	/**通过Cookie的方式跳过登陆
	 * @param dr,url,sessiond(指定用户的sessiond)
	 * @return dr
	 */
	public static WebDriver LoginSessiond(WebDriver dr,String url,String sessiond){
		System.out.println(dr.manage().getCookies()); //打印当前cookies
		dr.manage().deleteAllCookies(); //删除cookies
		dr.manage().addCookie(new Cookie("JSESSIONID",sessiond));	
		System.out.println(dr.manage().getCookies());
		dr.get(url);		
		return dr;
	}
}
