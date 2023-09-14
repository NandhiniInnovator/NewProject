package org.AdctinPom;

import org.hooks.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPom extends BaseClass {
	public SelectHotelPom() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	@FindBy(id="continue")
	private WebElement continues;
	
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getContinues() {
		return continues;
	}
	

}
