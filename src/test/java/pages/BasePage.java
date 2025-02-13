package pages;

// Importaciones necesarias
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

    /*
     * Declaración de una variable estática 'driver' de tipo WebDriver
     * Esta variable va a ser compartida por todas las instancias de BasePage y sus subclases
     */

    protected static WebDriver driver;
    
    /*
     * Declaración de una variable de instancia 'wait' de tipo WebDriverWait.
     * Se inicializa inmediatamente con una instancia dew WebDriverWait utilizando el 'driver' estático
     * WebDriverWait se usa para poner esperas explícitas en los elementos web
     */

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    /* 
     * Configura el WebDriver para Chrome usando WebDriverManager.
     * WebDriverManager va a estar descargando y configurando automáticamente el driver del navegador
    */

    static {
        WebDriverManager.chromedriver().setup();

        //Inicializa la variable estática 'driver' con una instancia de ChromeDriver

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    /*
     * Este es el constructor de BasePage que acepta un objeto WebDriver como argumento.
     */

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    //Método estático para navegar a una URL.
    public static void navegarA(String url) {
        driver.get(url);
    }

    //Método estático para cerrar la instancia del driver. 
    public static void closeBrowser () {
        driver.quit();
    }

    // Encuentra y devuelve un WebElement en la página utilizando un locator XPath, esperando a que esté presente en el DOM
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {
        Find(locator).click();
    }

    public void write(String locator, String keysToSend) {
        Find(locator).clear(); // Limpiar el texto que pueda haber
        Find(locator).sendKeys(keysToSend);
    }

    public void selectFromDropdownByValue(String locator, String value) {
        Select dropdown = new Select(Find(locator));

        dropdown.selectByValue(value);
    }

    public void selectFromDropdownByIndex(String locator, int index) {
        Select dropdown = new Select(Find(locator));

        dropdown.selectByIndex(index);
    }

    public int dropdownSize(String locator) {
        Select dropdown = new Select(Find(locator));

        List<WebElement> dropdownOption = dropdown.getOptions();

        return dropdownOption.size();
    }

    // Este metodo devuelve todos los valores en formato texto de los que hay en un dropdown
    public List<String> getDropdownValores(String locator) {
        Select dropdown = new Select(Find(locator));

        List<WebElement> opcionesDropdown = dropdown.getOptions();
        List<String> valores = new ArrayList<>();
        for (WebElement opcion : opcionesDropdown) {
            valores.add(opcion.getText());
        }
        return valores;
    }

    // Método para hacer scroll hasta un elemento
    public void scrollToElement(String locator) {
        WebElement element = Find(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Método para obtener el identificador de la ventana actual
    public String getCurrentWindowHandle() {
        return driver.getWindowHandle();
    }

    // Método para cambiar a una nueva ventana
    public void switchToNewWindow(String originalWindowHandle) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Espera a que haya una nueva ventana
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        
        // Obtiene todos los identificadores de ventanas abiertas
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle); // Cambia a la nueva ventana
                break;
            }
        }
    }
    
}
