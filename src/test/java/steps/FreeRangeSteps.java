package steps;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.SoftAssertions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaAutoSandbox;
import pages.PaginaCursos;
import pages.PaginaIntroAlTesting;
import pages.PaginaPrincipal;
import pages.PaginaRecursos;

public class FreeRangeSteps {

    SoftAssertions softly = new SoftAssertions();

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos paginaCursos = new PaginaCursos();
    PaginaIntroAlTesting paginaIntroAlTesting = new PaginaIntroAlTesting();
    PaginaRecursos paginaRecursos = new PaginaRecursos();
    PaginaAutoSandbox paginaAutoSandbox = new PaginaAutoSandbox();

    @Given("Navegar a www.freerangetesters.com")
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

    @When("El usuario selecciona Recursos y navega a Automation Sandbox")
    public void navegarToAutoSandbox() {
        landingPage.clickMenuRecursos();
        paginaRecursos.guardarIdPestaña();
        paginaRecursos.clickAutoSandbox();
        paginaRecursos.cambiarPestaña();
    }

    @And("Seleccionar Introduccion al Testing y comprar")
    public void navegarAIntro() {
        paginaCursos.clickIntroTesting();
        paginaIntroAlTesting.clickComprarAhora();
    }

    @Then("^(?:Puedo|El sistema puede) validar las opciones del primer dropdown de la apgina Automation Sandbox$")
    public void validarPrimerDropdownEnAutoSandbox() {
        List<String> lista = paginaAutoSandbox.valoresPrimerDropdown();
        List<String> listaEsperada = Arrays.asList("Seleccionáaaaaaaaaaaa un deporte", "Fútbol", "Tennis", "Basketball");

        softly.assertThat(lista).isEqualTo(listaEsperada);
    }

    // Ejemplo de método con comentarios explicativos
    /**
     * Método de ejemplo para demostrar el uso de assertions.
     */

    public void EjemploAssertions() {
        String palabraEsperada = "Pepe";
        String palabraEncontrada = "Papa";
    
        Integer numeroLoco = 1;
        Integer numeroLoco2 = 2;
    
    softly.assertThat(numeroLoco).isEqualTo(numeroLoco2); // ✅
    softly.assertThat(palabraEncontrada).isNotEqualTo(palabraEsperada); // ✅
    softly.assertThat(palabraEncontrada).isEqualTo(palabraEsperada); // ✅
    softly.assertThat(palabraEncontrada.contains(palabraEsperada)).isTrue(); // ✅
    softly.assertThat(palabraEncontrada.contains(palabraEsperada)).isFalse(); // ✅
    
    //softly.assertAll(); // Ejecuta todas las verificaciones
    }
    

}
