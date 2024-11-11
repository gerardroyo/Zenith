package pages;

// Importaciones necesarias
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    // Encuentra y devuelve un WebElement en la página utilizando un locator XPath, esperando a que esté presente en el DOM
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {
        Find(locator).click();
    }
    
}
