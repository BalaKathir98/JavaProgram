package com.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseMethods;

public class AmazonLogin extends BaseMethods {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		WebElement home = driver.findElement(By.id("nav-link-accountList"));
		home.click();

		WebElement userID = driver.findElement(By.id("ap_email"));
		sendkey(userID, "7550137837");

		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();

		WebElement password = driver.findElement(By.id("ap_password"));
		sendkey(password, "balaji28");

		WebElement signup = driver.findElement(By.id("signInSubmit"));
		signup.click();

	}

}
