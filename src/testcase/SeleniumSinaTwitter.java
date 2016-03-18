//����seleniumû����htmlunitһ����ȡHtmlImage���󣬻�ȡ�������������ý�ͼ������֤�����ͼ����
package testcase;

 

import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

 

 

public class SeleniumSinaTwitter  {
    
    

  public static void snapshot(TakesScreenshot drivername, String filename)
  {
      // this method will take screen shot ,require two parameters ,one is driver name, another is file name
      
      
        File scrFile = drivername.getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        try {
            System.out.println("save snapshot path is:E:/"+filename);
            FileUtils.copyFile(scrFile, new File("E:\\"+filename));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Can't save screenshot");
            e.printStackTrace();
        } 
        finally
        {
            System.out.println("screen shot finished");
        }
  }
  
  public static void snapshot2(WebDriver drivername, String filename)
  {
      // this method will take screen shot ,require two parameters ,one is driver name, another is file name
      
      
      //  File scrFile = drivername.getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        try {
        	  WebDriver augmentedDriver = new Augmenter().augment(drivername);
              File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
              File file = new File("E:\\"+filename);
              FileUtils.copyFile(screenshot, file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Can't save screenshot");
            e.printStackTrace();
        } 
        finally
        {
            System.out.println("screen shot finished");
        }
  }
  
  public static byte[] takeScreenshot(WebDriver driver) throws IOException {
		WebDriver augmentedDriver = new Augmenter().augment(driver);
      return ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.BYTES);
		//TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		//return takesScreenshot.getScreenshotAs(OutputType.BYTES);
		}

	 public static BufferedImage createElementImage(WebDriver driver,WebElement webElement)
	    		throws IOException {
	    		// ���webElement��λ�úʹ�С��
	    		Point location = webElement.getLocation();
	    		Dimension size = webElement.getSize();
	    		// ����ȫ����ͼ��
	    		BufferedImage originalImage =
	    		ImageIO.read(new ByteArrayInputStream(takeScreenshot(driver)));
	    		// ��ȡwebElement����λ�õ���ͼ��
	    		BufferedImage croppedImage = originalImage.getSubimage(
	    		location.getX(),
	    		location.getY(),
	    		size.getWidth(),
	    		size.getHeight());
	    		return croppedImage;
	    		}
  
   public static void login(WebDriver driver)throws Exception{
	   //����΢���Լ����������۵�ַ
	   //http://weibo.com/comment/outbox?wvr=1
	   String login = "https://login.sina.com.cn/signup/signin.php?entry=homepage";
	   driver.get(login);
	   Thread.sleep(2000);
	   WebElement keyWord = driver.findElement(By.xpath("//input[@name='username']"));
	   keyWord.clear();
	   keyWord.sendKeys("nbr987654321@163.com");
	   keyWord = driver.findElement(By.xpath("//input[@name='password']"));
	   keyWord.clear();
	   keyWord.sendKeys("XXX");
	   try{
		   keyWord = driver.findElement(By.xpath("//img[@id='check_img']"));
		   if(keyWord!=null){
			   
			   String src =  keyWord.getAttribute("src");
			   System.out.println("��֤���ַ ====="+src);
			   if(src!=null && !"".equals(src)){
				   BufferedImage inputbig = createElementImage(driver,keyWord);
				   ImageIO.write(inputbig, "png", new File("e://testasdasd.png")); 
				   String key= "";
				   //��֤�������
				   keyWord = driver.findElement(By.xpath("//input[@id='door']"));   
				   keyWord.clear();
				   keyWord.sendKeys(key);
			   }
			   
		   }
	   }catch(Exception e){
		   e.printStackTrace();
	   }
	   keyWord = driver.findElement(By.xpath("//input[@class='btn_submit_m']"));
	   keyWord.click();
	   Thread.sleep(2000);
	   try{
		   keyWord = driver.findElement(By.xpath("//img[@id='check_img']"));
		   if(keyWord!=null){
			   String src =  keyWord.getAttribute("src");
			   System.out.println("��֤���ַ ====="+src);
			   if(src!=null && !"".equals(src)){
				   snapshot2(driver,"open_baidu_sinaweibo1111111111.png");
				   
				   BufferedImage inputbig = createElementImage(driver,keyWord);
				   ImageIO.write(inputbig, "png", new File("e://testasdasd.png")); 
				   
				   String key= "";
				   //��֤�������
				   keyWord = driver.findElement(By.xpath("//input[@id='door']"));   
				   keyWord.clear();
				   keyWord.sendKeys(key);
				   //���ύ
				   keyWord = driver.findElement(By.xpath("//input[@class='btn_submit_m']"));
				   keyWord.click();
			   }
			   
		   }
	   }catch(Exception e){
		   e.printStackTrace();
	   }
	   Thread.sleep(2000);
   }
   
 

    public static void main (String [] args) throws Exception
    {
         
    	 String serverUrl = "http://192.168.1.107:4444/wd/hub";
        String URL="http://weibo.com/comment/outbox?wvr=1";//http://coral.qq.com/1008591939
        //System.setProperty("webdriver.chrome.driver", "d:\\ie\\chromedriver.exe"); 
        //WebDriver driver = new ChromeDriver();
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        capability.setJavascriptEnabled(true);
        WebDriver driver = new RemoteWebDriver(new URL(serverUrl), capability);
        //���3s�ڻ���λ�������׳��쳣
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //ҳ����س�ʱʱ������Ϊ5s
       // driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        //driver.manage.script_timeout = 3 #seconds
        driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
        login(driver);
        snapshot2(driver,"open_baidu_sinaweibo1.png");
       //��ת��ҳ��
       // driver.navigate().to(URL);
        driver.get(URL);
        //max size the browser
        driver.manage().window().maximize(); 
 /*
        Navigation navigation = driver.navigate();
         navigation.to(URL);*/
         Thread.sleep(2000);
         //snapshot((TakesScreenshot)driver,"open_baidu.png");
         snapshot2(driver,"open_baidu_sinaweibo.png");
       
     
         
          driver.quit();
           
       
    }
    
}
