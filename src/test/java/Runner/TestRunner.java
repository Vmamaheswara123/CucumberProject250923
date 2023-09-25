package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/test.feature",glue = {"StepDef"},
monochrome = true,
plugin = {"pretty", "html:target/htmlreports/reports"}
		)
public class TestRunner {


	
}

/*
 * plugin = {"pretty", "json:target/jsonReports/reports.json"}
 * plugin = {"pretty", "junit:target/junitReports/reports.xml"}
 * 
 * tags = "@SmokeTest"
 */