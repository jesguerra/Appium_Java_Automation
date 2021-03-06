package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/TestFeatures"
                , glue="stepDefinition",plugin = "html:target/cucumber-report")
public class Runner {
}
