package org.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\LENOVO\\eclipse-workspace\\"
		+ "SampleCucumber\\FeatureFile\\Facebook.feature",glue = "org.stepdefinition",dryRun =false)
public class RunnerClass {

}
