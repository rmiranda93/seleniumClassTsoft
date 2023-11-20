package codigo;

// No es necesario importar java.lang.Object ni java.lang.String ya que son importados por defecto

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        //String rutaDriver = "\\Users\\exrmirp\\Desktop\\SeleniumClass\\bci_Selenium\\src\\test\\resources\\Drivers\\chromedriver";
        //System.setProperty("webdriver.chrome.driver",rutaDriver);

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.cl");
        Thread.sleep(5000); // Espera de 5 segundos
    }
}
