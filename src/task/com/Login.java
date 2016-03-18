package task.com;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class Login {
	
	/**ͨ��Cookie�ķ�ʽ������½
	 * @param dr,url,sessiond(ָ���û���sessiond)
	 * @return dr
	 */
	public static WebDriver LoginSessiond(WebDriver dr,String url,String sessiond){
		System.out.println(dr.manage().getCookies()); //��ӡ��ǰcookies
		dr.manage().deleteAllCookies(); //ɾ��cookies
		dr.manage().addCookie(new Cookie("JSESSIONID",sessiond));	
		System.out.println(dr.manage().getCookies());
		dr.get(url);		
		return dr;
	}
}
