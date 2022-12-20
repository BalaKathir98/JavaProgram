package com.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class BaseMethods {
	public static WebDriver driver;
	public static Actions as;
	public static JavascriptExecutor js;

	public static void browserlaunch(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		}
	}

	public static void webSiteLaunch(String Url) {
		driver.get(Url);
	}

	public static void minimize() {
		driver.manage().window().minimize();
	}

	public static void fullscreen() {
		driver.manage().window().fullscreen();
	}

	// Navigate Methods
	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void newurl(String url) {
		driver.navigate().to(url);
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void sendkey(WebElement element, String name) {
		element.sendKeys(name);
	}

	// Alert Methods
	public static void alertPopup(WebElement element) throws InterruptedException {
		element.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

	public static void alertPopup1(WebElement element, String OkorCancel) throws InterruptedException {
		element.click();
		Thread.sleep(3000);
		if (OkorCancel.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
		}
	}

	public static void alertPopUp2(WebElement element, String value, String okorcancel) {
		element.click();
		Alert textbox = driver.switchTo().alert();
		textbox.sendKeys(value);
		if (okorcancel.equalsIgnoreCase("ok")) {
			textbox.accept();
		} else {
			textbox.dismiss();
		}
	}

	// Screenshot Method
	public static void screenShot(String pathname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(pathname);
//		FileUtils.copyFile(source, target); 
		Files.copy(source, target);

	}

	public static void actionsMoveToElement(WebElement element) {
		as = new Actions(driver);
		as.moveToElement(element).perform();
	}

	public static void javaScriptExecutor(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	public static void select(WebElement element, int a) {
		Select s = new Select(element);
		s.selectByIndex(a);

	}

}
