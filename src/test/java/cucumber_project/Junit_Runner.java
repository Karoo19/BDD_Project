package cucumber_project;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun= false,
		monochrome=true,
		features= {"src/test/java"},
		glue= {"cucumber_project"},
		plugin= {"pretty","html:target/site/cucumber-html","json:target/cucumber.json"},
		tags= "@LookingForMMAGyms"
	
		)

public class Junit_Runner {

}
