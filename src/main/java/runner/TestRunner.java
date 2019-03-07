package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)  
	@CucumberOptions(
		format= {"pretty","html:target/cucumber"},
		features = "H:\\UshaData\\Selenium\\CucumberDemo\\src\\main\\java\\features\\login.feature", //the path of the feature files
		glue={"stepDefinitions"} //the path of the step definition files
		)

public class TestRunner {

}
  