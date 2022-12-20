package com.baseclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo extends BaseMethods {
	
	
	public static void main(String[] args) {
		
		browserlaunch("chrome");
		webSiteLaunch("https://www.saucedemo.com/");
		
		 List<WebElement> userNames = driver.findElements(By.xpath("//div[@id='login_credentials']//br"));
		
		for (WebElement webElement : userNames) {
			
			System.out.println(webElement.getText());
		}
		
		
		
	}

}
