package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/Features/GoogleSearch.feature", glue = {
		"stepDefinations" }, monochrome = true
//, plugin = {"pretty", "html:target/HtmlReports"}
//,plugin = {"pretty", "json:target/JSONReports/report.json"}
//,plugin = { "pretty", "junit:target/junitReports/report.xml"}
				, plugin = { "pretty", "json:target/JSONReports/cucumber.json", "html:target/HtmlReports" }

		, tags = {"@leena or @docker or @google"})

public class TestRunner {

}
