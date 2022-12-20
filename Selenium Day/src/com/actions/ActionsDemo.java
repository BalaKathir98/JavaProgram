package com.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.BaseMethods;

public class ActionsDemo extends BaseMethods {

	public static void main(String[] args) throws InterruptedException, AWTException {

//		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		// Popup - Disable
//		ChromeOptions options = new ChromeOptions(); 
//		options.addArguments("disable-notifications");
//		ChromeDriver driver = new ChromeDriver(options); 
		browserlaunch("chrome");
//		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
//		actionsMoveToElement(men);    
//		WebElement suits = driver.findElement(By.xpath("//a[@data-reactid='45']"));
//	
//		actionsMoveToElement(suits);     
//		javaScriptExecutor(suits);   

//		WebElement customer = driver.findElement(By.xpath("//p[@data-reactid='53']"));
//		Actions ac = new Actions(driver);
//		ac.scrollToElement(customer).perform();
//		Thread.sleep(3000);

		Robot r = new Robot();
		for (int i = 0; i < 50; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

//		driver.navigate().back();
//		WebElement womens = driver.findElement(By.xpath("//a[@data-reactid='180']"));
//		as.moveToElement(womens);
//
//		WebElement sarees = driver.findElement(By.xpath("//a[@data-reactid='194']"));
//		as.moveToElement(sarees);
//		js.executeScript("arguments[0].click()", sarees);
//
//		driver.navigate().back(); 
//		Thread.sleep(3000);
//		WebElement men1 = driver.findElement(By.className("desktop-main"));
//		Thread.sleep(3000);
//		as.moveToElement(men1).perform();
//
//		WebElement jeans = driver.findElement(By.xpath("//a[@data-reactid='64']"));
//		as.moveToElement(jeans).perform();
//		js.executeScript("arguments[0].click()", jeans);
//		WebElement down = driver.findElement(By.xpath("//p[@data-reactid='174']"));
// 
//		js.executeScript("arguments[0].scrollIntoView()", down);
//       js.executeScript("window.scrollBy(0,1000)");  
//
//		Thread.sleep(2000);
//
//      js.executeScript("window.scrollBy(0,-1000)");
//
//		WebElement up = driver.findElement(By.xpath("//h1[@class='title-title']"));
//		js.executeScript("arguments[0].scrollIntoView()", up);

	}

}
