package runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // Ruta de tus archivos .feature (ej: src/test/resources/features)
@ConfigurationParameter(
    key = io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME,
    value = "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm, pretty"
)
@ConfigurationParameter(
    key = io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME,
    value = "steps" // Reemplaza con tu paquete de Step Definitions
)
public class TestRunner {
}