package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;
import pages.PaginaRecursos;
import pages.PaginaAutoSandbox;
import pages.PaginaCursos;
import pages.PaginaIntroAlTesting;


public class FreeRangeSteps {

    SoftAssert soft = new SoftAssert();

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos paginaCursos = new PaginaCursos();
    PaginaIntroAlTesting paginaIntroAlTesting = new PaginaIntroAlTesting();
    PaginaRecursos paginaRecursos = new PaginaRecursos();
    PaginaAutoSandbox paginaAutoSandbox = new PaginaAutoSandbox();

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

    @Then("Puedo validar las opciones del primer dropdown de la apgina Automation Sandbox")
    public void validarPrimerDropdownEnAutoSandbox() {
        List<String> lista = paginaAutoSandbox.valoresPrimerDropdown();
        List<String> listaEsperada = Arrays.asList("Seleccioná un deporte", "Fútbol", "Tennis", "Basketball");

        Assert.assertEquals(listaEsperada, lista);
    }

    public void EjemploAssertions() {
        String palabraEsperada = "Pepe";
        String palabraEncontrada = "Papa";
    
        Integer numeroLoco = 1;
        Integer numeroLoco2 = 2;
    
        Assert.assertEquals(numeroLoco, numeroLoco2);
    
        // Verificar que dos valores no son iguales
        Assert.assertNotEquals(palabraEsperada, palabraEncontrada);
    
        // Verificar que dos valores no iguales
        Assert.assertEquals(palabraEsperada, palabraEncontrada);
    
        // Verificar que una condición es verdadera
        Assert.assertTrue(palabraEncontrada.contains(palabraEsperada));
    
        // Verificar que una condición es false
        Assert.assertFalse(palabraEncontrada.contains(palabraEsperada));

        // Soft Assertions: No detienen la ejecución al fallar. Ideal para verificar
        // muchas cosas pequeñas a la vez.
        soft.assertEquals(palabraEsperada, palabraEncontrada);
        soft.assertTrue(palabraEncontrada.contains(palabraEsperada));
        soft.assertNotEquals(palabraEncontrada,palabraEsperada);
 
        soft.assertAll();
    }
    

}
