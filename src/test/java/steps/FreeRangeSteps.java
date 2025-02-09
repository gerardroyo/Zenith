package steps;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("Navegar a www.freerangtesters.com")
    public void navegarAFRT(){
        landingPage.navegarAFreeRangeTesters();
    }
    
    @When("Voy a las {word} usando la barra de navegacion")
    public void usoBarraNavegacion(String seccion) {
        landingPage.clickSeccionBarraNavegacion(seccion);
    }
}
