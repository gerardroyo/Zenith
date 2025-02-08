package pages;

public class PaginaPrincipal extends BasePage {

    //private String botonAcceder = "//button[normalize-space()='Accede ya']";

    public PaginaPrincipal(){
        super(driver);
    }

    //Metodo para navegar a www.freerangetesters.com
    public void navegarAFreeRangeTesters(){
        navegarA("https://www.freerangetesters.com");
    }

}
