package com.pom;

import java.time.Duration;

import com.baseclass.BaseMethods;

public class AdactinLogin extends BaseMethods {
	public static void main(String[] args) {
		browserlaunch("chrome");  
		webSiteLaunch("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage a = new LoginPage(driver);

		sendkey(a.getUsername(), "Balaji28");
		sendkey(a.getPassword(), "balaji@28");
		a.getLogin().click();
		select(a.getLocation(), 3);
		select(a.getHotels(), 2);
		select(a.getRoomtype(), 3);
		select(a.getNoofrooms(), 2);
		sendkey(a.getCheckin(), "15/08/22");
		sendkey(a.getCheckout(), "18/08/22");
		select(a.getAdultroom(), 2);
		select(a.getChildroom(), 2);
		a.getSubmit().click();

		a.getRadiobutton().click();
		a.getCont().click();

		sendkey(a.getFirstname(), "Bala");
		sendkey(a.getLastname(), "k");
		sendkey(a.getAddress(), "xyz");
		sendkey(a.getCardno(), "1236547887456321");
		select(a.getCardtype(), 2);
		select(a.getExpirymonth(), 3);
		select(a.getExpiryyear(), 4);
		sendkey(a.getCvv(), "123");
		a.getBooknowbutton().click();
		String str1 = a.getOrderno().getAttribute("value");
		System.out.println("Order no :" + str1);

	}
}
