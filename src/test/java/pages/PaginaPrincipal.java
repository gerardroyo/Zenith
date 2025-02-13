package pages;

public class PaginaPrincipal extends BasePage {

    private String linkSeccion = "//a[normalize-space()='%s' and @href]";
    private String botonElegirPlanIntroQA = "//a[@href='https://www.freerangetesters.com/nivel-inicial-fundamentos-del-testing' and normalize-space()='Ver plan de carrera']";
    private String botonMenuRecursos = "//a[normalize-space()='Recursos' and @href]";

    public PaginaPrincipal(){
        super(driver);
    }

    //Metodo para navegar a www.freerangetesters.com
    public void navegarAFreeRangeTesters(){
        navegarA("https://www.freerangetesters.com");
    }

    public void clickSeccionBarraNavegacion(String seccion) {
        //Reemplazar el marcador de posición en linkSeccion con el nombre
        String xpathString = String.format(linkSeccion, seccion);
        clickElement(xpathString);
    }

    public void clickMenuRecursos() {
        clickElement(botonMenuRecursos);
    }

    public void clickPlanIntroQA() {
        clickElement(botonElegirPlanIntroQA);
    }

}
