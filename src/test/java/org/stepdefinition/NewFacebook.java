package org.stepdefinition;

import java.io.File;
import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewFacebook extends BaseClass {
	FacebookPom pom;

	@Given("Browser Launch")
	public void browser_launch() {
	   browserLaunch("chrome");
	   loadUrl("https://www.facebook.com/");
	   pom = new FacebookPom();
	   
	}
	@When("user give to {string} and {string}")
	public void user_give_to_and(String string, String string2) {
		sendvalue(pom.getUserName(), string);
		sendvalue(pom.getPassWord1(), string2);
	  }
	@When("user click to loginButton")
	public void user_click_to_login_button() {
	    clickvalue(pom.getLogin());
	}
	@Then("take {string}")
	public void take_nandy() throws IOException {
	   takeScreenshot(new File("C:\\Users\\LENOVO\\eclipse-workspace\\SampleCucumber\\target\\string.png"));
	}




}
