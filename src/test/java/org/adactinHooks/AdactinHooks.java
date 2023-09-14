package org.adactinHooks;

import org.AdctinPom.PageManager;
import org.hooks.BaseClass;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class AdactinHooks extends BaseClass {
	PageManager page ;
@Before
@Given("Browser Launch")
public void browser_launch() {
   browserLaunch("chrome");
   loadUrl("http://adactinhotelapp.com/");
   page = new PageManager();
}
}
