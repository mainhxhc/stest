package task.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	
	/**���ͣ������
	 * @param dr,el
	 * @return dr
	 */
	public   static  void  wait(WebDriver dr, WebElement el){
		Actions builder =new Actions(dr); 
		builder.moveToElement(el).perform();		
	}
	
	/**�һ���꣬ѡ���ݷ�ʽ
	 * @param dr,el,keycode(���̵ļ�ֵ)
	 * 
	 */
	public   static  void  rightclick(WebDriver dr, WebElement el,int keycode) throws IOException{
		Actions action = new Actions(dr) ;	
		action.contextClick(el).perform(); //ѡ��Ԫ�أ��������Ҽ�
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(keycode);//����һ�
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //Runtime.getRuntime().exec("cmd.exe /c start c:\\test.bat");  //����exe�ļ�

	}

}
