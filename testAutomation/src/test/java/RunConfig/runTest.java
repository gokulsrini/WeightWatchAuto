package RunConfig;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/cucumber"} ,
glue = {"stepDef"} , 
		format={"pretty","html:reports/test-report"},
		monochrome = true
				
		)


public class runTest {
}
