package com.alert;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.AWTException;
import java.awt.Robot;

import com.baseclass.BaseMethods;


public class AlertDemo extends BaseMethods {
	public static void main(String[] args) throws InterruptedException, IOException ,AWTException{
		browserlaunch("chrome");
		webSiteLaunch("https://demo.automationtesting.in/Alerts.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		WebElement simpleAlert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
          
		Robot r = new Robot();
		
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOf(simpleAlert));
		alertPopup(simpleAlert);
		

		Wait wa = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);

	}
}
