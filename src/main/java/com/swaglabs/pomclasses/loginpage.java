package com.swaglabs.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	@FindBy(xpath = "//input[@id'user-name']")private WebElement untxt;
	@FindBy(xpath = "//input[@id'password']")private WebElement pwdtxt;
	@FindBy(xpath = "//input[@id'login-button']")private WebElement loginBtn;
	public loginpage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	public  WebElement getUntxt() {
		return untxt;
		
		
	}
	public  Web Element getPwdtxt() {
		return pwdtxt;
		
		
	}
	public  WebElement getLoginBtn() {
		return loginBtn;
		
		
	}

public void loginToApp(String Un,String Pwd) {
	untxt.sendKeys(Un);
	pwdtxt.sendKeys(Pwd);
	loginBtn.click();
}
}

