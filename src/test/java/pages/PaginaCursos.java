package pages;

public class PaginaCursos extends BasePage {

    private String botonIntroAlTesting = "//a[@href='/introduccion-al-testing-de-software'][normalize-space()='Ver producto']";
    
    public PaginaCursos() {
        super(driver);
    }

    public void clickIntroTesting() {
        clickElement(botonIntroAlTesting);
    }

}
