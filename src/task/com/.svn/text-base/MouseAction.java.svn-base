package task.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	
	/**鼠标停留动作
	 * @param dr,el
	 * @return dr
	 */
	public   static  void  wait(WebDriver dr, WebElement el){
		Actions builder =new Actions(dr); 
		builder.moveToElement(el).perform();		
	}
	
	/**右击鼠标，选择快捷方式
	 * @param dr,el,keycode(键盘的键值)
	 * 
	 */
	public   static  void  rightclick(WebDriver dr, WebElement el,int keycode) throws IOException{
		Actions action = new Actions(dr) ;	
		action.contextClick(el).perform(); //选中元素，点击鼠标右键
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(keycode);//鼠标右击
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //Runtime.getRuntime().exec("cmd.exe /c start c:\\test.bat");  //运行exe文件

	}

}
