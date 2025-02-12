package pages;

public class PaginaIntroAlTesting extends BasePage {

    private String botonComprarAhora = "//a[normalize-space()='Compra ahora' and @href]";
    
    public PaginaIntroAlTesting() {
        super(driver);
    }

    public void clickComprarAhora() {
        clickElement(botonComprarAhora);
    }

}
