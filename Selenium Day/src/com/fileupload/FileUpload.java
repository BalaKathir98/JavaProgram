package com.fileupload;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.screenrecorder.VideoRecorder_utlity;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		VideoRecorder_utlity.startRecord("FileUpload");

		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node0pu9eggb8y65815hs700j479ug99196.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement basicUpload = driver.findElement(By.id("j_idt88:j_idt89_input"));
		File fileupload = new File("C:\\Users\\lenovo\\Downloads\\Java theory\\JAVA.docx");
		basicUpload.sendKeys(fileupload.getAbsolutePath());
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();

		WebElement advance = driver.findElement(By.id("j_idt97:j_idt98_label"));
		File fileupload1 = new File("C:\\Users\\lenovo\\Pictures\\siraivaasi\\Rajini.jpg");
		advance.sendKeys(fileupload1.getAbsolutePath());

		VideoRecorder_utlity.stopRecord();

	}

}
