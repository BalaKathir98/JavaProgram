package com.actions;

import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.BaseMethods;


public class Actions_ScrollUp extends BaseMethods {

	public static void main(String[] args) throws InterruptedException {

		browserlaunch("chrome");

		webSiteLaunch("https://www.amazon.in/");

//		 Actions at = new Actions(driver);
//		 
//	      at.sendKeys(Keys.PAGE_DOWN).build().perform(); 
//
		Actions actions = new Actions(driver);
      
		Thread.sleep(3000);
		
		
		
		// Scroll Down using Actions class
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		
		// Scroll Up using Actions class
		actions.keyUp(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		// actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
        
		
		
		// Scroll Down using Robot class
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//
//		Thread.sleep(3000);
//
//		// Scroll Up using Robot class
//		r.keyPress(KeyEvent.VK_PAGE_UP);
//		r.keyRelease(KeyEvent.VK_PAGE_UP);

	}

}
