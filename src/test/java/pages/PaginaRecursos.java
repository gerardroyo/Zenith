package pages;

public class PaginaRecursos extends BasePage {

    private String textoAutoSandbox = "//h3[normalize-space()='Automation Sandbox']";
    private String originalWindowHandle;
    
    public PaginaRecursos () {
        super(driver);
    }

    public void clickAutoSandbox() {
        clickElement(textoAutoSandbox);
    }

    // Guarda el identificador de la ventana actual ANTES de hacer clic
    public void guardarIdPestaña() {
        originalWindowHandle = getCurrentWindowHandle();
    }

    // Cambia el foco a la nueva ventana
    public void cambiarPestaña() {
        switchToNewWindow(originalWindowHandle);
    }

}
