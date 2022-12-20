package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Balaji\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
//	WebElement userName = driver.findElement(By.id("email"));
	WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
	userName.sendKeys("123654789");
	
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("123654");
	
	Thread.sleep(3000);
	
	WebElement logIn = driver.findElement(By.name("login"));
	logIn.click();
	
	
	
	
	
	
	
	
	
}

}
