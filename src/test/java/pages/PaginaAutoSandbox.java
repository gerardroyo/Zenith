package pages;

import java.util.List;

public class PaginaAutoSandbox extends BasePage {

    private String primerDropdown = "//select[@id='formBasicSelect']";

    public PaginaAutoSandbox() {
        super(driver);
    }

    public List<String> valoresPrimerDropdown() {
        return getDropdownValores(primerDropdown);
    }
    
}
