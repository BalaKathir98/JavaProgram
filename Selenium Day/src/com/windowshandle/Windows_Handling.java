package com.windowshandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balaji\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
	
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement Bestseller = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(Bestseller).perform();
		

		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
