package org.AdctinPom;

import org.hooks.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPom extends BaseClass {
	public SearchHotelPom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	@FindBy(id="adult_room")
	private WebElement adultsRoom;
	@FindBy(id="child_room")
	private WebElement childRooms;
	@FindBy(id="Submit")
	private WebElement search;
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	public WebElement getAdultsRoom() {
		return adultsRoom;
	}
	public WebElement getChildRooms() {
		return childRooms;
	}
	public WebElement getSearch() {
		return search;
	}
}
	
	


