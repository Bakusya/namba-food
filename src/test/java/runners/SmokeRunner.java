package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                   "html:target/default-cucumber-reports",
                   "json:target/cucumber.json"}, // будет давать JSON отчеты
        features = {"classpath:features"},
        glue = {"step_definitions"},
        dryRun = false,
        tags = {"@Test1"}

)
public class SmokeRunner {


}
