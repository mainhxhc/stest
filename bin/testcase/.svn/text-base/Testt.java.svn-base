package testcase;


import java.awt.image.BufferedImage;

import java.io.File;



import javax.imageio.ImageIO;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.WebDriver;


import org.testng.annotations.Test;


import task.com.BrowerAction;




public class Testt {
	private WebDriver dr;
	@Test
	public void test4 () throws Exception{
		String url=("http://www.10010fj.cn/login!init.action?flag=0");
		dr = BrowerAction.startChrome(url);	
		Thread.sleep(6000);
		dr.manage().window().maximize();
	
		 try{  
			// dr.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);  //超时时间等等
			 WebElement keyWord = dr.findElement(By.xpath("//*[@id='loginImg']")); 
			 System.out.println("keyWord======="+keyWord);
			 Thread.sleep(3000);
	           if(keyWord!=null){  	                 
	              String src =  keyWord.getAttribute("src");
	              System.out.println("src======="+src);
	               if(src!=null && !"".equals(src)){  
	                   BufferedImage inputbig = Img.createElementImage(dr,keyWord);  
	                   Thread.sleep(3000);
	                   ImageIO.write(inputbig, "jpg", new File("c://71.jpg"));
	              }  	                 
	           }  
	       }catch(Exception e){  
	           e.printStackTrace();  
	       }  
       Thread.sleep(10000);
       Runtime.getRuntime().exec("cmd.exe /c start c:\\test.bat");  
       Thread.sleep(30000);
       String filePath = "c:\\test.txt";
       String read = Img.readTxtFile(filePath);//读取文件内容
       if (read.equals(null)){
          System.out.print("验证码读取失败，关闭浏览器");
          dr.quit();
        }		
        dr.findElement(By.xpath("//*[@id='mobileNumTwo']")).sendKeys("18650992020");
        dr.findElement(By.xpath("//*[@id='passwordOne']")).sendKeys("840211");
        dr.findElement(By.xpath("//*[@id='vfPicOne']")).sendKeys(read);
        dr.findElement(By.xpath("//*[@id='loginBtn']")).click();
        Thread.sleep(30000);
       // dr.quit();
	
	}

	
}
