package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.EnvironmentManager;

public class Hooks {

    @Before
    public void setUp() throws Exception{

    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }
        } catch (Exception e) {
            System.out.println("The error happened while cleaning up after the test: " +
                    e.getMessage());
        }
        //we perform a clean up after each test
        Driver.closeDriver();
    }
}
