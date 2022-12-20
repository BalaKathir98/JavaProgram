package com.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.BaseMethods;

public class ShoopToolsAutomation extends BaseMethods {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// balajikathir - username password - Balaji@7550137837
//		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//		 WebDriver driver = new ChromeDriver();
		browserlaunch("chrome");
		webSiteLaunch("https://shop.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement Dismiss = driver.findElement(By.linkText("Dismiss"));
		Dismiss.click();
		Thread.sleep(1200);
		WebElement MyAcc = driver.findElement(By.linkText("My Account"));
		MyAcc.click();
		/*
		 * WebElement Username =
		 * driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		 * Username.sendKeys("SmShameer"); Thread.sleep(1200);
		 * 
		 * WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		 * Email.sendKeys("smshameer0@gmail.com"); Thread.sleep(1200);
		 * 
		 * WebElement Password =
		 * driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		 * Password.sendKeys("awzlerhtk497"+Keys.ENTER); Thread.sleep(1200);
		 */

		WebElement Usernamelog = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Usernamelog.sendKeys("balajikathir");
		Thread.sleep(1200);

		WebElement Rememberme = driver.findElement(By.name("rememberme"));
		Rememberme.click();
		Thread.sleep(1000);

		WebElement Passlog = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		Passlog.sendKeys("Balaji@7550137837" + Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,  200)");

		WebElement Order = driver.findElement(By.linkText("Orders"));
		Order.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,  400)");
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,  -400)");

		WebElement Cart = driver.findElement(By.xpath("//span[@class='cart-name-and-total']"));
		Cart.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,  200)");
		Thread.sleep(2000);
		WebElement Return2Shop = driver.findElement(By.xpath("//a[@class='button wc-backward']"));
		Thread.sleep(1000);

		Return2Shop.click();
		Thread.sleep(2000);

		/*
		 * 
		 * js.executeScript("window.scrollBy(0,  200)"); WebElement Product =
		 * driver.findElement(By.linkText("Browse products")); Product.click();
		 * Thread.sleep(2000);
		 * 
		 * js.executeScript("window.scrollBy(0,  400)");
		 */

		js.executeScript("window.scrollBy(0,  3000)");

		WebElement Nextpage = driver.findElement(By.xpath("(//a[@class='page-numbers'])[1]"));
		Nextpage.click();
		Thread.sleep(1000);

		WebElement Tshirt = driver.findElement(By.xpath("//a[text()='red satin round neck backless maxi dress']"));
		Tshirt.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,  350)");

		WebElement open = driver.findElement(By.xpath("//select[@id='pa_color']"));
		open.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,  100)");
		WebElement Size = driver.findElement(By.xpath("//select[@id='pa_size']"));
		Size.click();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,  100)");

		WebElement Submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Submit.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,  100)");

		WebElement ViewC = driver.findElement(By.xpath("//a[@class='button wc-forward']"));
		ViewC.click();
		Thread.sleep(2000);

		WebElement Couponcode = driver.findElement(By.name("noo_coupon_code"));
		Couponcode.sendKeys("awz5678");
		Thread.sleep(1200);
		js.executeScript("window.scrollBy(0,  50)");

		WebElement Checkout = driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
		Actions a = new Actions(driver);
		a.click(Checkout).perform();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,  50)");

		WebElement name1 = driver.findElement(By.name("billing_first_name"));
		name1.clear();
		name1.sendKeys("Shameer");
		Thread.sleep(1200);

		WebElement lastname = driver.findElement(By.id("billing_last_name"));
		lastname.clear();
		lastname.sendKeys("Sm");
		Thread.sleep(1200);

		WebElement Company = driver.findElement(By.id("billing_company"));
		Company.clear();
		Company.sendKeys("Starshellcraft");
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,  100)");

		/*
		 * WebElement Country = driver.findElement(By.xpath(
		 * "(//span[@class='select2-selection__rendered'])[1]"));
		 * a.click(Country).perform(); Thread.sleep(1200);
		 * 
		 * WebElement India =
		 * driver.findElement(By.xpath("(//li[@role='option'])[103]"));
		 * a.moveToElement(India).perform(); Thread.sleep(1000);
		 */
		WebElement Staddress = driver.findElement(By.xpath("//input[@autocomplete='address-line1']"));
		Staddress.clear();
		Staddress.sendKeys("101 riversidestreet");
		Thread.sleep(2000);

		WebElement Apartment = driver
				.findElement(By.xpath("//input[@data-placeholder=\"Apartment, suite, unit, etc. (optional)\"]"));
		Apartment.clear();
		Apartment.sendKeys("Hansa Apartments");
		Thread.sleep(2000);

		WebElement City = driver.findElement(By.xpath("//input[@autocomplete=\"address-level2\"]"));
		City.clear();
		City.sendKeys("Chennai");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,  100)");

		WebElement Pincode = driver.findElement(By.xpath("(//input[@class='input-text '])[7]"));
		Pincode.clear();
		Pincode.sendKeys("600020");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,  100)");

		WebElement Phoneno = driver.findElement(By.xpath("//input[@type='tel']"));
		a.doubleClick(Phoneno).perform();
		Phoneno.sendKeys("7010047239");
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,  200)");

		WebElement COMMENTS = driver.findElement(By.xpath("//textarea[@name='order_comments']"));
		COMMENTS.sendKeys("Value for Money");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,  -200)");

		Thread.sleep(1000);

		WebElement tn = driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[2]"));
		a.click(tn).perform();
		js.executeScript("window.scrollBy(0,  -200)");
		Thread.sleep(1000);

		WebElement Tamilnadu = driver.findElement(By.xpath("(//li[@role='option'])[25]"));
		a.click(Tamilnadu).perform();
		Thread.sleep(1000);

		WebElement Acceptbutton = driver.findElement(By.xpath("//input[@type='checkbox']"));
		a.click(Acceptbutton).perform();
		js.executeScript("window.scrollBy(0,  -200)");
		Thread.sleep(2000);

//		WebElement tshirt = driver.findElement(By.xpath("(//div[@class='noo-product-inner noo-product-inner2'])[2]"));
//		tshirt.click();
//		WebElement colour = driver.findElement(By.id("pa_color"));
//		Select s = new Select(colour);
//		s.selectByIndex(1);
//		WebElement size = driver.findElement(By.id("pa_size"));
//		select(size, 1);
//		WebElement addToCart = driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']"));
//		addToCart.click();
//
//		WebElement cart = driver.findElement(By.xpath("//span[@class='cart-name-and-total']"));
//		cart.click();
//		WebElement proceed = driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
//		proceed.click();
//
//		WebElement firstName = driver.findElement(By.id("billing_first_name"));
//		firstName.sendKeys("Balaji");
//
//		WebElement lastName = driver.findElement(By.id("billing_last_name"));
//		lastName.sendKeys("K");
//
////		WebElement country = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
////		Select x = new Select(country);
////		x.selectByIndex(4);
//
//		Robot r = new Robot();
//
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		for (int i = 0; i < 4; i++) {
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//
//		}
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//
//		WebElement address = driver.findElement(By.id("billing_address_1"));
//		address.sendKeys("No :111A Xyz Road");
//
//		WebElement city = driver.findElement(By.id("billing_city"));
//		city.sendKeys("chennai");
//
//		WebElement state = driver.findElement(By.id("billing_state"));
//		state.sendKeys("Tamlinadu");
//
//		WebElement postcode = driver.findElement(By.id("billing_postcode"));
//		postcode.sendKeys("600008");
//
//		WebElement phone = driver.findElement(By.id("billing_phone"));
//		phone.sendKeys("7550137837");
//
//		WebElement mailid = driver.findElement(By.id("billing_email"));
//		mailid.sendKeys("xyz@gmail.com");
//
//		Thread.sleep(3000);
//
//		WebElement checkbox = driver.findElement(By.xpath("//button[text()='Place order']"));
//		checkbox.click();
//
//		//WebElement placeOrder = driver.findElement(By.id("place_order"));
//		//placeOrder.click();

	}

}