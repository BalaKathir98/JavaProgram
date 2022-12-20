package com.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseMethods;

public class GreensKart extends BaseMethods {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//button[@type ='button'])[7]")).click();
		driver.findElement(By.xpath("(//button[@type ='button'])[8]")).click();

		driver.findElement(By.xpath("//img[@alt='Cart']")).click();

		driver.findElement(By.xpath("(//button[@type ='button'])[1]")).click();
//		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("120");
//		driver.findElement(By.xpath("//button[@class='promoBtn']")).click(); 
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		WebElement country = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
        Select s = new Select(country);
        s.selectByValue("India");
        
        WebElement checkBox = driver.findElement(By.xpath("//input[@class='chkAgree']"));
        checkBox.click();
        
        WebElement proceed = driver.findElement(By.xpath("//button[text()='Proceed']"));
        proceed.click();
        
	
	}
}
