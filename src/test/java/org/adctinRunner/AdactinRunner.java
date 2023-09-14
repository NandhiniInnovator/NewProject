package org.adctinRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\LENOVO\\eclipse-workspace\\"
		+ "SampleCucumber\\FeatureFile\\Adactin.feature",glue="org.adactinSteps",dryRun = false)
public class AdactinRunner {
	

}
