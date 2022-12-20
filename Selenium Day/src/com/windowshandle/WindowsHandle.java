package com.windowshandle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
  
public class WindowsHandle {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");   

		WebElement mobiles = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));

		Actions ac = new Actions(driver); 
		ac.contextClick(mobiles).perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN); 
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
  
		WebElement electronics = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_5']"));
		ac.contextClick(electronics).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement fashion = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_7']"));
		ac.contextClick(fashion).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
////////////////////////////////////////////////////////////////////////////////////
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> win = new ArrayList<>(windowHandles);

		String home = driver.switchTo().window(win.get(0)).getTitle();
		System.out.println(home);

		String fashiontab = driver.switchTo().window(win.get(1)).getTitle();
		System.out.println(fashiontab);

		String electronictab = driver.switchTo().window(win.get(2)).getTitle();
		System.out.println();

		String mobiletab = driver.switchTo().window(win.get(3)).getTitle();
		System.out.println(mobiletab);

		// mobile tab
		driver.switchTo().window(win.get(3));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13");
		driver.findElement(By.id("nav-search-submit-button")).click();

		// electronics tab
		driver.switchTo().window(win.get(2));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart watch for men");
		driver.findElement(By.id("nav-search-submit-button")).click();

		// fashion tab
		driver.switchTo().window(win.get(1));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart watch for men");
		driver.findElement(By.id("nav-search-submit-button")).click();

	}

} 
