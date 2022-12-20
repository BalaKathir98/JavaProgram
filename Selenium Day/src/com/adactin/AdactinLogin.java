package com.adactin;

import com.baseclass.BaseMethods;

public class AdactinLogin extends BaseMethods {

	public static void main(String[] args) throws InterruptedException {

		browserlaunch("chrome");
		webSiteLaunch("https://adactinhotelapp.com/");

		AdactinPom a = new AdactinPom(driver);

//		sendkey(a.getUsername(), "Balaji28");
//		sendkey(a.getPassowrd()	, "balaji@28");
		a.getUsername().sendKeys("Balaji28");

		Thread.sleep(3000);

		a.getLogin().click();

	}

}
