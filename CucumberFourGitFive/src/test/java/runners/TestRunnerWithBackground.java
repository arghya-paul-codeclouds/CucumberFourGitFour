package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features with background", glue = "stepDefinitionsBackground", plugin = { "pretty",
		"html:target/my-html-report.html" })
public class TestRunnerWithBackground extends AbstractTestNGCucumberTests {
}
