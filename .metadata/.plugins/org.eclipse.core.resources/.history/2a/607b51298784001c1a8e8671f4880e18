package executar;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature",
		glue = "test",
		tags = "@Regressivo",
		dryRun = false,
		plugin = {"pretty","html:targt/report.html"},
		monochrome = true
		)

public class Runner {

	
}
