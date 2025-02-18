package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import pages.BasePage;

public class Hooks extends BasePage {
    
    public Hooks() {
        super(driver);
    }

    @After
    public void tareaDeMantenimiento (Scenario scenario) {
        if(scenario.isFailed()) {
            scenario.log("Falló el scenario, porfavor hechale un vistazo a la imagen adjuntada a este reporte");
            final byte[] screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot del error");
        }
    }

}
