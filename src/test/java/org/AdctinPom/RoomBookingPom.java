package org.AdctinPom;

import org.hooks.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomBookingPom extends BaseClass{
public RoomBookingPom() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="first_name")
private WebElement firstName;
@FindBy(id="last_name")
private WebElement LastName;
@FindBy(id="address")
private WebElement address;
@FindBy(id="cc_num")
private WebElement cardNo;
@FindBy(id="cc_type")
private WebElement cardType;
@FindBy(id="cc_exp_month")
private WebElement month;
@FindBy(id="cc_exp_year")
private WebElement year;
@FindBy(id="cc_cvv")
private WebElement cvvNumber;
@FindBy(id="book_now")
private WebElement bookNow;
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return LastName;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCardNo() {
	return cardNo;
}
public WebElement getCardType() {
	return cardType;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getCvvNumber() {
	return cvvNumber;
}
public WebElement getBookNow() {
	return bookNow;
}



}
