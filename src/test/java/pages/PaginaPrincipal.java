package pages;

public class PaginaPrincipal extends BasePage {

    private String linkSeccion = "//a[normalize-space()='%s' and @href]";

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

}
