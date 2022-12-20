package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Pom {
	
	public static WebDriver driver;

	// annotation is a command which controls the flow of execution of our text

	@FindBy(xpath = "//input[@name='FirstName']")
	private WebElement firstName;

	@FindBy(id = "Surname")
	private WebElement sureName;

	@FindBy(id = "E_post")
	private WebElement epost;

	@FindBy(id = "Mobile")
	private WebElement mobile;

	@FindBy(id = "Username")
	private WebElement username;

	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpassword;

	@FindBy(id = "submit")
	private WebElement submit;

	public SignUp_Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSureName() {
		return sureName;
	}

	public WebElement getEpost() {
		return epost;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
