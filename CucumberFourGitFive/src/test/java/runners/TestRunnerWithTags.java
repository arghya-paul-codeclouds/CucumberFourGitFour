package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features with tags", glue = "stepDefinitions", tags ="@smoke and @regression or @test", plugin = { "pretty",
		"html:target/my-html-report.html" })
public class TestRunnerWithTags extends AbstractTestNGCucumberTests {
}
