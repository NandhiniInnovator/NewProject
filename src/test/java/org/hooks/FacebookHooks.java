package org.hooks;

import org.stepdefinition.FacebookPom;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class FacebookHooks extends BaseClass {
	@Before
	public void initialSetup() {
		browserLaunch("chrome");
		loadUrl("https://www.facebook.com/");
		}
	@After
	public void finalsetup() {
		//driver.quit();

	}
		}

