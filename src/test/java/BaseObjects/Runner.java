package BaseObjects;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:target/report.json")
public class Runner {
	
	public void test() {
	System.out.println("This has been run");
	}
}
