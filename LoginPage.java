package com.fb.automation.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="loginbutton")
	WebElement loginbutton;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void typeEmail(String n){
		email.sendKeys(n);
	}
	
	public void typePass(String p){
		password.sendKeys(p);
		loginbutton.click();
	}
	
	public void login(){
		loginbutton.click();
	}
	

}
