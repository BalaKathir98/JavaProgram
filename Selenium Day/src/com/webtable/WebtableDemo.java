 package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDemo {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		System.out.println("====Prnt All Data=====");
		List<WebElement> table = driver.findElements(By.id("customers"));
		for (WebElement allData : table) {
			
			String a = allData.getText();
			System.out.println(a);
		}
//			
//			
//
//			System.out.println("=====Data=========");
//			String b = "UK";
//
//			if (a.contains(b)) {
//				System.out.println("Data is Present");
//			} else {
//				System.out.println("Data is not Present");
//			}
//		}
		System.out.println("=======Prnt 4th Row=======");
		List<WebElement> fourthRow = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr[2]"));
		for (WebElement fourthdata : fourthRow) {
			System.out.println(fourthdata.getText());

		}
//		System.out.println("========Prnt 3rd Col=========");
//		List<WebElement> thirdCol = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr/td[3]"));
//		for (WebElement coldata : thirdCol) {
//			System.out.println(coldata.getText());
//		}
//		System.out.println("=========Prnt using tagname=========");
//
		List<WebElement> tagname = driver.findElements(By.tagName("th"));
		for (WebElement prntrow : tagname) {
			System.out.println(prntrow.getText());
		}
//		System.out.println("========Specific Data==========");
//		WebElement specificData = driver.findElement(By.xpath("//table[@id = 'customers']/tbody/tr[5]/td[3]"));
//		System.out.println(specificData.getText());
//
//		System.out.println("========Row & Col size========");
//		List<WebElement> row = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr"));
//		int rowsize = row.size();
//
//		List<WebElement> col = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr/th"));
//		int colsize = col.size();
//
//		System.out.println("Row size : " + rowsize + " & " + "Col size :" + colsize);
	}
	}

