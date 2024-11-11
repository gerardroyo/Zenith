package pages;

public class PaginaPrincipal extends BasePage {

    private String botonAcceder = "//a[@class='sc-epnzzT oORQE']";

    public PaginaPrincipal(){
        super(driver);
    }

    //Metodo para navegar a www.freerangetesters.com
    public void navegarAFreeRangeTesters(){
        navegarA("https://www.freerangetesters.com");
        clickElement(botonAcceder);
    }

}
