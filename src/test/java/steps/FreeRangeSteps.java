package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("Navegar a www.freerangtesters.com")
    public void navegarAFRT(){
        landingPage.navegarAFreeRangeTesters();
    }
    
}
