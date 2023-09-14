package org.AdctinPom;

import org.hooks.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom extends BaseClass {
	public LoginPom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement userName;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement Login;
	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return Login;
	}
	
	

}
