package org.adactinSteps;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.AdctinPom.LoginPom;
import org.AdctinPom.PageManager;
import org.hooks.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinSteps extends BaseClass {
	PageManager page ;
	@Given("Browser Launch")
	public void browser_launch() {
	   browserLaunch("chrome");
	   loadUrl("http://adactinhotelapp.com/");
	   page = new PageManager();
	}
	@When("enter the userName and Password")
	public void enter_the_user_name_and_password(DataTable dataTable) {
		List<String> asList = dataTable.asList();
		page.getLoginPom().getUserName().sendKeys(asList.get(0));
		page.getLoginPom().getPassword().sendKeys(asList.get(1));
		}
	@Then("click loginButton")
	public void click_login_button() {
		page.getLoginPom().getLogin().click();
	}

	@When("Enter the details")
	public void enter_the_details() {
		page = new PageManager();
		selectByIndex(page.getSearchHotelPom().getLocation(), 4);
		selectByIndex(page.getSearchHotelPom().getHotel(), 3);
		selectByIndex(page.getSearchHotelPom().getRoomType(), 4);
		selectByIndex(page.getSearchHotelPom().getNoOfRooms(), 2);
		selectByIndex(page.getSearchHotelPom().getAdultsRoom(), 1);
		selectByIndex(page.getSearchHotelPom().getChildRooms(), 1);
		clickvalue(page.getSearchHotelPom().getSearch());
	    }
	@When("click Search")
	public void click_search() {
		clickvalue(page.getSearchHotelPom().getSearch());
	}
	@Then("Take Screenshot")
	public void take_screenshot() throws IOException {
	   takeScreenshot(new File("C:\\Users\\LENOVO\\eclipse-workspace\\SampleCucumber\\target"));
	}
	@When("Enter the Details and click continueButton")
	public void enter_the_details_and_click_continue_button() {
		page = new PageManager();
	   clickvalue(page.getSelectHotelPom().getRadioButton());
	   clickvalue(page.getSelectHotelPom().getContinues());
	}
	@When("Enter the detils and click")
	public void enter_the_detils_and_click(DataTable dataTable) {
		page = new PageManager();
		List<Map<String, String>> asMaps = dataTable.asMaps();
		page.getRoomBookingPom().getFirstName().sendKeys(asMaps.get(0).get("FirstName"));
		page.getRoomBookingPom().getLastName().sendKeys(asMaps.get(0).get("LastName"));
		page.getRoomBookingPom().getAddress().sendKeys(asMaps.get(0).get("Address"));
		page.getRoomBookingPom().getCardNo().sendKeys(asMaps.get(0).get("CardNo"));
		selectByIndex(page.getRoomBookingPom().getCardType(), 2);
		selectByIndex(page.getRoomBookingPom().getMonth(), 4);
		selectByIndex(page.getRoomBookingPom().getYear(), 10);
		page.getRoomBookingPom().getCvvNumber().sendKeys(asMaps.get(0).get("CvvNo"));
		page.getRoomBookingPom().getBookNow().click();
	    
	}
	@Then("quit")
	public void quit() {
	    driver.quit();
	}




	}


	
