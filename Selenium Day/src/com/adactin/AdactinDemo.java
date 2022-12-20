package com.adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinDemo {
	public static void main(String[] args) throws AWTException, InterruptedException{

		Robot r = new Robot();

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://adactinhotelapp.com/index.php");

		driver.findElement(By.id("username")).sendKeys("Balaji28");

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		driver.findElement(By.id("password")).sendKeys("balaji@28");
		driver.findElement(By.id("login")).click();

		WebElement locationbox = driver.findElement(By.id("location"));
		Select s = new Select(locationbox);
		s.selectByValue("Melbourne");

		WebElement hotelsbox = driver.findElement(By.name("hotels"));
		Select s1 = new Select(hotelsbox);
		List<WebElement> options = s1.getOptions();
		System.out.println("Options in dropdown box :" + options);
		s1.selectByIndex(3);

		WebElement roombox = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roombox);
		s2.selectByVisibleText("Double");

		WebElement roomsbox = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(roomsbox);
		s3.selectByValue("2");

		driver.findElement(By.name("datepick_in")).sendKeys("15/08/22");
		driver.findElement(By.name("datepick_out")).sendKeys("17/02/22");

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.id("radiobutton_0")).click();

		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("first_name")).sendKeys("Balaji");

		driver.findElement(By.id("last_name")).sendKeys("K");

		driver.findElement(By.id("address")).sendKeys("103 xyz road");

		driver.findElement(By.id("cc_num")).sendKeys("12365457887456321");

		r.keyPress(KeyEvent.VK_TAB);

		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		for (int i = 0; i < 12; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		driver.findElement(By.id("cc_cvv")).sendKeys("123");

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String str = driver.findElement(By.id("order_no")).getAttribute("value");
		System.out.println("Order no :" + str);

//	driver.findElement(By.id("my_itinerary")).click();
//	
//	driver.findElement(By.id("order_id_text")).sendKeys(str);
//	
//	driver.findElement(By.id("search_hotel_id")).click();

	}
}
