package org.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefinition extends BaseClass { 
	String name;
	FacebookPom pom;
	
	@Given("Facebook URL launch")
	public void facebook_url_launch() {
		browserLaunch("edge");
		loadUrl("https://www.facebook.com/");
		}
	@When("user give to userName and password and login")
	public void user_give_to_user_name_and_password_and_login() {
		pom = new FacebookPom();
		name="login";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  sendvalue(pom.getUserName(),"Nandhini");
	  sendvalue(pom.getPassWord1(),"123");
	  clickvalue(pom.getLogin());
	  driver.navigate().back();
	  driver.navigate().refresh();
	  
	}
	@When("user to click forgetButton")
	public void user_to_click_forget_button() {
		pom = new FacebookPom();
		name="password";
	    clickvalue(pom.getForgetPassword());
	    sendvalue(pom.getMailPhone(),"1234567890");
	    clickvalue(pom.getSearch());
	    driver.navigate().back();
	    }
	@When("user create new Account")
	public void user_create_new_account() throws InterruptedException {
		pom = new FacebookPom();
		name="account";
	    clickvalue(pom.getCreateAccount());
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    sendvalue(pom.getFirstName(),"Prabhu");
	    sendvalue(pom.getLastName(),"naga");
	    sendvalue(pom.getMobileNum(),"1234567890");
	    sendvalue(pom.getPassWord(),"12345");
	    selectByIndex(pom.getDay(), 4);
	    selectByIndex(pom.getMonth(), 5);
	    selectByIndex(pom.getYear(), 8);
	    clickvalue(pom.getFemale());
	    clickvalue(pom.getSignUp());
	    driver.navigate().back();
	    driver.navigate().refresh();
	    
	}
	@Then("take screenshot")
	public void take_screenshot() throws IOException {
		File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\SampleCucumber\\target\\"+name+".png");
	    takeScreenshot(file);
	}


}
