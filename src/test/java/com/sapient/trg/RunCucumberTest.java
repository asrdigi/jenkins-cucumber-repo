package com.sapient.trg;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
@CucumberOptions(
		features = "classpath:features",		
		plugin = {"pretty", "json:target/cucumber-report.json"}
		)
public class RunCucumberTest {

}
