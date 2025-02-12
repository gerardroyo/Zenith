package steps;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;
import pages.PaginaCursos;
import pages.PaginaIntroAlTesting;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos paginaCursos = new PaginaCursos();
    PaginaIntroAlTesting paginaIntroAlTesting = new PaginaIntroAlTesting();

    @Given("Navegar a www.freerangtesters.com")
    public void navegarAFRT(){
        landingPage.navegarAFreeRangeTesters();
    }
    
    @When("Voy a {word} usando la barra de navegacion")
    public void usoBarraNavegacion(String seccion) {
        landingPage.clickSeccionBarraNavegacion(seccion);
    }

    @When("El usuario selecciona Elegir Plan")
    public void elegirPlanIntroQA() {
        landingPage.clickPlanIntroQA();
    }

    @And("Seleccionar Introduccion al Testing y comprar")
    public void navegarAIntro() {
        paginaCursos.clickIntroTesting();
        paginaIntroAlTesting.clickComprarAhora();
    }
}
