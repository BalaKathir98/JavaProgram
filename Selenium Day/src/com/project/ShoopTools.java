package com.project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.fileupload.FileUpload;

public class ShoopTools {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Balaji\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();

		WebElement Dismiss = driver.findElement(By.linkText("Dismiss"));
		Dismiss.click();

		Thread.sleep(3000);
		WebElement MyAcc = driver.findElement(By.linkText("My Account"));
		MyAcc.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		WebElement Usernamelog = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Usernamelog.sendKeys("balajikathir");

		Thread.sleep(1200);

		WebElement Rememberme = driver.findElement(By.name("rememberme"));
		Rememberme.click();

		Thread.sleep(1000);

		WebElement Passlog = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		Passlog.sendKeys("Balaji@7550137837" + Keys.ENTER);

		Thread.sleep(1000);

		WebElement homePage = driver.findElement(By.xpath("//span[text()='ToolsQA Demo Site']"));
		homePage.click();

		Thread.sleep(1200);

		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(1200);

		driver.findElement(By.xpath("(//div[@class='noo-product-inner noo-product-inner2'])[2]")).click();

		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(1200);

		WebElement color = driver.findElement(By.xpath("//select[@id='pa_color']"));
		Select s = new Select(color);
		s.selectByValue("grey");

		Thread.sleep(1200);

		WebElement size = driver.findElement(By.xpath("//select[@data-attribute_name='attribute_pa_size']"));
		Select s1 = new Select(size);
		s1.selectByValue("42");

		WebElement addToCart = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		addToCart.click();

		driver.findElement(By.xpath("//i[@class='icon_bag_alt']")).click();

		js.executeScript("window.scrollBy(0,1000)");

		WebElement proceedToCheckOut = driver
				.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
		proceedToCheckOut.click();

		js.executeScript("window.scrollBy(0,1000)");

		js.executeScript("window.scrollBy(0,1000)");

		Thread.sleep(1200);

		WebElement OrderNotes = driver.findElement(By.id("order_comments"));
		OrderNotes.sendKeys("Automation Practice");

		js.executeScript("window.scrollBy(0,-1000)");

		Thread.sleep(1200);

		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));

		checkBox.click();
		
		driver.findElement(By.xpath("//button[@id='place_order']")).click();
		
		driver.navigate().refresh();
		
		js.executeScript("window.scrollBy(0,500)");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Balaji\\eclipse-workspace\\Selenium\\Screenshot\\ShoopTools.png");
		FileUtils.copyFile(src, des);
		
		System.out.println("Program Completed SuccessFully");
	}

}
