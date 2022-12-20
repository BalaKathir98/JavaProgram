package com.browser;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class BrowserDemo {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balaji\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement name = driver.findElement(By.cssSelector("[id^='e']"));
 
		name.sendKeys("vkt123@gmail.com");
		WebElement pass = driver.findElement(By.cssSelector("[data-testid$='pass']"));
		pass.sendKeys("12345678");
		
		
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		
		

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		w.until(ExpectedConditions.elementToBeClickable(login));
		
		login.click();
		
//		JavascriptExecutor js = (JavascriptExecutor) driver ;
//		js.executeScript
//		("arguments[0].style.border='2px solid black'",
//				name);
	
		
		
		
	}

}
