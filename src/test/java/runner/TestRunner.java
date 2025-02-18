package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features", // Directorio de nuestros archivos .feature
        glue = "steps", // Paquete donde tenemos nuestras clases definiendo los steps escritos en el feature file
        plugin = { "pretty", "html:target/cucumber-reports", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm" },
        tags = "@Navegacion")
        // comando para ejecutar tags en concreto en la terminal:
        // PowerShell: gradle test -D "cucumber.filter.tags=@Plans"
        // Bash: ./gradlew test -Dcucumber.filter.tags="@Planss"

public class TestRunner {
    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }
}
