package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src//test//resource//Features"}, 
				glue = {"stepdef2"},
				plugin = {"pretty", "html:target/htmlreports/report.html"},
				tags = "@demowebshop"
				)

public class testrunner2 extends AbstractTestNGCucumberTests {

}
