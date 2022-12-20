package com.webtable;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebDemo {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
//		System.out.println("====Prnt All Data=====");
		List<WebElement> table = driver.findElements(By.xpath("//table[@id= 'customers']/tbody/tr/td"));
		Scanner sc = new Scanner(System.in);
		System.out.println("=====Enter the value=========");

		String data = sc.nextLine();
		
		
		for (WebElement allData : table) {
			
			String data1 = allData.getText();
//			System.out.println(data1);
			
		
			
			
			boolean equal = data.equalsIgnoreCase(data1);
		
			if (equal) {
				System.out.println("Data is Present");
				}
		
		}
		System.out.println("End");
}}

