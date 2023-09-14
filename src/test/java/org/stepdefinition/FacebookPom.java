package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPom extends BaseClass {
	public FacebookPom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement userName;
	@FindBy(xpath="//input[@type='password']")
	private WebElement passWord1;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgetPassword;
	@FindBy(xpath="//input[@placeholder='Email address or mobile number']")
	private WebElement mailPhone;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement search;
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement createAccount;
	@FindBy(xpath="//input[@placeholder='First name']")
    private WebElement firstName;
	@FindBy(xpath="//input[@aria-label='Surname']")
	private WebElement lastName;
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mobileNum;
	@FindBy(xpath="//input[@data-type='password']")
	private WebElement passWord;
	@FindBy(xpath="//select[@title='Day']")
	private WebElement day;
	@FindBy(xpath="//select[@title='Month']")
	private WebElement month;
	@FindBy(xpath="//select[@title='Year']")
	private WebElement year;
	@FindBy(xpath="//input[@value='1']")
	private WebElement female;
    @FindBy(xpath="//input[@value='2']")
	private WebElement male;
    @FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement signUp;
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord1() {
		return passWord1;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getForgetPassword() {
		return forgetPassword;
	}
	public WebElement getMailPhone() {
		return mailPhone;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getCreateAccount() {
		return createAccount;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getMobileNum() {
		return mobileNum;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getFemale() {
		return female;
	}
	public WebElement getMale() {
		return male;
	}
	public WebElement getSignUp() {
		return signUp;
	}
	

}
