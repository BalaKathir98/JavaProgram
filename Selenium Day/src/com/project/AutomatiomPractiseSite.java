package com.project;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.BaseMethods;

public class AutomatiomPractiseSite extends BaseMethods {
	public static void main(String[] args) throws InterruptedException, IOException {
		browserlaunch("chrome");
		webSiteLaunch("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement womens = driver.findElement(By.xpath("//a[@title='Women']"));
		womens.click();

		WebElement tshirt = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[3]"));
		Actions as = new Actions(driver);
		as.moveToElement(tshirt).perform();

		WebElement addToCart = driver
				.findElement(By.xpath("(//a[@class='button ajax_add_to_cart_button btn btn-default'])[2]"));
		addToCart.click();

		WebElement proceedToCart = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		proceedToCart.click();

		WebElement proceedToCheckout = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		proceedToCheckout.click();

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("balabjz28@gmail.com");

		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("balaji28");

		WebElement signBtn = driver.findElement(By.id("SubmitLogin"));
		signBtn.click();

		WebElement proceedToCheck = driver.findElement(By.name("processAddress"));
		proceedToCheck.click();

		WebElement checkBox = driver.findElement(By.id("cgv"));
		checkBox.click();

		WebElement proceedToCheckout1 = driver.findElement(By.name("processCarrier"));
		proceedToCheckout1.click();

		WebElement payByBank = driver.findElement(By.xpath("//a[@class='bankwire']"));
		payByBank.click();

		WebElement confirmOrder = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		confirmOrder.click();
   
		Thread.sleep(3000);

		screenShot("C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Screenshot\\img.png");
		
//		WebElement backToOrders = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
//		backToOrders.click();

	}

}
