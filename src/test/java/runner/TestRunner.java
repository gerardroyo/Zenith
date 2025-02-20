package runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber") // Habilita Cucumber como motor de pruebas
@SelectClasspathResource("features") // Ruta de tus archivos .feature (relativa a src/test/resources)
@ConfigurationParameter(
    key = GLUE_PROPERTY_NAME,
    value = "steps" // Paquete donde están tus step definitions
)
public class TestRunner { 
    // No necesitas @AfterClass si usas JUnit 5
    // El cierre del navegador debe manejarse en hooks de Cucumber
}