package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPom {

	public static WebDriver driver;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement passowrd;

	@FindBy(id = "login")
	private WebElement login;

	public AdactinPom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassowrd() {
		return passowrd;
	}

	public WebElement getLogin() {
		return login;
	}

}
