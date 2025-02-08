package pages;

public class PaginaPrincipal extends BasePage {

    private String botonAcceder = "//a[@href='https://www.freerangetesters.com/nivel-inicial-fundamentos-del-testing']";

    public PaginaPrincipal(){
        super(driver);
    }

    //Metodo para navegar a www.freerangetesters.com
    public void navegarAFreeRangeTesters(){
        navegarA("https://www.freerangetesters.com");
    }

}
