package task.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowerAction {
	
	/**启动Chrome
	 * @param dr,url
	 * @return dr
	 */
	public static WebDriver startChrome(String url){
		WebDriver dr =null;
		System.setProperty("webdriver.chrome.driver","e:/data/自动化/下载文件/chromedriver.exe");
		
		dr = new ChromeDriver();
		dr.get(url);
		return dr;
	}	
	
	/**启动Firefox
	 * @param dr,url
	 * @return dr
	 */
	public static WebDriver startFirefox(WebDriver dr,String url){
		dr =new  FirefoxDriver();
		dr.get(url);
		return dr;
	}
	
	/**启动Chrome
	 * @param dr,url
	 * @return dr
	 */
	public static WebDriver startIe(WebDriver dr,String url){
		System.setProperty("webdriver.ie.driver", "D:/自动化/下载文件/IEDriverServer.exe");
		dr = new InternetExplorerDriver ();
		dr.get(url);
		return dr;
	}
	
	/**远程启动浏览器
	 * @param browser,nodeUrl
	 * @return dr
	 */
	public static WebDriver startRemote(String browser,String nodeUrl) throws InstantiationException, InterruptedException{
		
		DesiredCapabilities test = null;
		if(browser.equals("ie")){
			test=DesiredCapabilities.internetExplorer();
		}
		else if(browser.endsWith("chrome")){
			test=DesiredCapabilities.chrome();
		}
		else if(browser.endsWith("firefox")){
			test=DesiredCapabilities.firefox();
		}
		String url2 = nodeUrl+"/wd/hub";
		URL urlinstance = null;
		try {
			urlinstance = new URL(url2);
		} catch (MalformedURLException e) {
			System.out.println("实例化url出错");
		}		
		WebDriver dr = new RemoteWebDriver(urlinstance,test);
		return dr;	
	}
	
	
	/**窗口切换
	 * @param dr,windowTitle
	 * @return dr
	 */
	public static WebDriver newdr(WebDriver dr, String windowTitle){
		 String currentHandle = dr.getWindowHandle();  //获取当前窗口句柄     
		    Set<String> handles = dr.getWindowHandles();  //获取所有窗口句柄
		    try {
				 	
		   	 for (String s2 : handles) {
		   		Thread.sleep(3000);  //获取新窗口句柄时，需要增加延时，防止由于打开新窗口 句柄还没出来就去找了
						if (s2.equals(currentHandle))
							continue;
						else {
							dr.switchTo().window(s2);
							if (dr.getTitle().contains(windowTitle)) {
								dr.switchTo().window(s2);		
								
								break;
							} else
								continue;
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("获取新窗口失败");
				}
			return dr;
			
				
	}
	
	
	
	
}
