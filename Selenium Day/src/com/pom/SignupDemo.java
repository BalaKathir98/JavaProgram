package com.pom;

import com.baseclass.BaseMethods;

public class SignupDemo extends BaseMethods {
	public static void main(String[] args) {
	browserlaunch("chrome");
	webSiteLaunch("https://itera-qa.azurewebsites.net/UserRegister/NewUser");
	
	SignUp_Pom a = new SignUp_Pom(driver);
	
	
	sendkey(a.getFirstName(), "Balaji");
	sendkey(a.getSureName(),"k");
	sendkey(a.getEpost(),"11");
	sendkey(a.getMobile(),"1236547891");
	sendkey(a.getUsername(),"Bala28");
	sendkey(a.getPassword(),"balaji28");
	sendkey(a.getConfirmpassword(), "balaji28");
	a.getSubmit().click(); 
		
	} 
}
