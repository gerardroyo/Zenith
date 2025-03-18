package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.ByteArrayInputStream;

import pages.BasePage;

public class Hooks extends BasePage {
    
    public Hooks() {
        super(driver);
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            takeScreenshot(scenario.getName());
        }
    }

    private void takeScreenshot(String scenarioName) {
        if (driver instanceof TakesScreenshot takesScreenshot) {
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Screenshot on failure: " + scenarioName,
                new ByteArrayInputStream(screenshot));
        }
    }

}
