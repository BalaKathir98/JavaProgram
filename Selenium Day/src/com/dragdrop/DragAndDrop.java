package com.dragdrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
   public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://testautomationpractice.blogspot.com/");
	 
	 WebElement source = driver.findElement(By.id("draggable"));
	 WebElement target = driver.findElement(By.id("droppable"));
	 
	 Actions ac = new Actions(driver);
	 ac.dragAndDrop(source, target).perform();
	  
}
	
	
	
}
