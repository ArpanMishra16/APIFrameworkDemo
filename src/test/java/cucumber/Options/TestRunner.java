package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ARPAN MISHRA\\Downloads\\APIFramework\\APIFramework\\src\\test\\java\\features",plugin ="json:target/jsonReports/cucumber-report.json",glue= {"stepDefinations"})
public class TestRunner {
//tags= {"@DeletePlace"}  compile test verify
}
