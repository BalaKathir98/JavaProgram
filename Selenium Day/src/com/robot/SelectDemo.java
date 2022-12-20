package com.robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseMethods;

public class SelectDemo  extends BaseMethods{
	public static void main(String[] args) {	
		browserlaunch("chrome");
		webSiteLaunch("https://itera-qa.azurewebsites.net/home/automation");
	
		//Checkbox & Radio button Practise
		
		  driver.findElement(By.id("male")).click();
		  
		  driver.findElement(By.id("monday")).click();
		  
		  //DropDown Practise
		   
		  WebElement dropdown = driver.findElement(By.xpath("//select[@class='custom-select']"));
		  
		  Select s = new Select(dropdown);
		  s.selectByIndex(4); 
//		  s.selectByValue("5");
//		  s.selectByVisibleText("Italy");
		  
		  
		  
		
		
		
		
		
	}
	
	
	
	

}
