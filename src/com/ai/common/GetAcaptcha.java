package com.ai.common;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testcase.Img;

public class GetAcaptcha {

	public static void getImgCode(WebDriver dr, WebElement img)
			throws InterruptedException, IOException {
		try {
			if (img != null) {
				String src = img.getAttribute("src");
				System.out.println("src=======" + src);
				if (src != null && !"".equals(src)) {
					BufferedImage inputbig = IoAction.createElementImage(dr,
							img);
					Thread.sleep(3000);
					ImageIO.write(inputbig, "jpg", new File("c://71.jpg"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(10000);
		Runtime.getRuntime().exec("cmd.exe /c start c:\\test.bat");
		Thread.sleep(30000);
		String filePath = "c:\\test.txt";
		String read = Img.readTxtFile(filePath);// 读取文件内容
		if (read.equals(null)) {
			System.out.print("验证码读取失败，关闭浏览器");
			//dr.quit();
		}

	}
}
