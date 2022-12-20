package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseMethods;
import com.google.common.io.Files;
public class ScreenShotDemo extends BaseMethods {
	public static void main(String[] args) throws  IOException, InterruptedException {
		browserlaunch("chrome");
		webSiteLaunch("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("7550137837");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123654789");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		Thread.sleep(3000);
		
		screenShot("C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Screenshot\\pic22s.png");
		
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;  
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\\\Users\\\\lenovo\\\\eclipse-workspace\\\\Selenium\\\\Screenshot\\\\pic12.png");
		//FileUtils.copyFile(source, target); 
		Files.copy(source, target);
		
	}
  
} 
