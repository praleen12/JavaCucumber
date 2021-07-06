package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/Features/hooksDemo.feature", glue = {
		"hooksStep" }, monochrome = true
//, plugin = {"pretty", "html:target/HtmlReports"}
//,plugin = {"pretty", "json:target/JSONReports/report.json"}
//,plugin = { "pretty", "junit:target/junitReports/report.xml"}
		, plugin = { "pretty", "json:target/JSONReports/report.json", "html:target/HtmlReports" }

		, tags = {"@leenatest"})

public class TestRunnerHooks {

}
