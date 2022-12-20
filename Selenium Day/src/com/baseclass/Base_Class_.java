package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class_ {

	public static WebDriver driver;

	public static void browserLaunch(String browserName) {

		if (browserName.equalsIgnoreCase("ChRome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		// for firefox we have to use gecko
	}

	public static void urlmethod(String url) {

		driver.get(url);

	}

	private void selection(WebElement ele, String Option, String value) {

		Select s = new Select(ele);
		if (Option.equalsIgnoreCase("Byvalue")) {
			s.selectByValue(value);

		}

		else if (Option.equalsIgnoreCase("byindex")) {
			
			
		
		}

		
		
		
		
		
		
	}

}
