package com.windowshandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class WindowsDemo {
	public static void main(String[] args) throws AWTException  {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");  
		
		WebElement mobiles = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
		
		Actions a = new Actions(driver);
		a.contextClick(mobiles).perform();
		
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN); 
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
}}
