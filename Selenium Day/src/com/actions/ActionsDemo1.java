package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.BaseMethods;

public class ActionsDemo1 extends BaseMethods { 
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		 
		 FirefoxOptions options = new FirefoxOptions();
		 options.setProfile(new FirefoxProfile());
		 options.addPreference("dom.webnotifications.enabled", false);
	 
		 WebDriver driver = new FirefoxDriver(options);  
		 driver.get("https://www.myntra.com/"); 
			driver.manage().window().maximize();
		
			WebElement men = driver.findElement(By.xpath("(//a[@data-reactid='21'])[1]"));
//			move(men); 
			Actions as = new Actions(driver);
			 as.moveToElement(men).perform(); 
			 
				WebElement suits = driver.findElement(By.xpath("//a[@data-reactid='45']"));
//				move(suits);
	            as.moveToElement(suits).perform();
	            
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("arguments[0].click()", suits);   
	            Thread.sleep(3000); 
//	            driver.navigate().back(); 
//	           WebElement womens = driver.findElement(By.xpath("//a[@data-reactid='180']"));
//	           as.moveToElement(womens);
//	           
//	           WebElement sarees = driver.findElement(By.xpath("//a[@data-reactid='194']"));
//	           as.moveToElement(sarees);
//	           js.executeScript("arguments[0].click()", sarees);	
//	           
//	           driver.navigate().back();
//	   		Thread.sleep(3000);
//	   		WebElement men1 = driver.findElement(By.className("desktop-main"));
//	   		Thread.sleep(3000);  
//	   		
//	   		as.moveToElement(men1).perform();
//
//	   		WebElement jeans = driver.findElement(By.xpath("//a[@data-reactid='64']"));
//	   		as.moveToElement(jeans).perform();
//	   		js.executeScript("arguments[0].click()", jeans);
//	   		WebElement down = driver.findElement(By.xpath("//p[@data-reactid='174']"));

	           
	           
	}

}


 
