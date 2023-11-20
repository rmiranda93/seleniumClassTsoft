package codigo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
    public static void main(String[] args) throws InterruptedException{

        //Instanciar objetos para emular el browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bci.cl/personas");
        Thread.sleep(2000);

        //Localizador (By) es una forma de localizar los elementos web de un sitio. Existen 8 estrategias de busqueda:
        // ID,className, Name, tagname, linktext, partialLinktext, xpath(Relativo/Absoluto),cssSelector

        By localizadorBtnHazteCliente = By.xpath("//button[contains(text(),'Hazte Cliente')]");

        //Elemento Web (Botón, txt, dropDownList, label, link, etc)
        WebElement btnHazteCliente = driver.findElement(localizadorBtnHazteCliente);

        btnHazteCliente.click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@data-slide='next']")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[contains(text(),'Abrir plan cuenta corriente')]")).click();

        driver.manage().window().maximize();

        //Agregar texto en inputs
        Thread.sleep(3000);

        int size = driver.findElements(By.tagName("iframe")).size();

        System.out.println("el sitio cuenta: "+size + " iframes");

        driver.switchTo().frame(0);

        Thread.sleep(1000);

        driver.findElement(By.name("nombre")).sendKeys("Rafael");

        Thread.sleep(1000);

        driver.findElement(By.name("apellidoPaterno")).sendKeys("Miranda");

        Thread.sleep(1000);

        driver.findElement(By.name("apellidoMaterno")).sendKeys("Perez");

        Thread.sleep(1000);

        driver.findElement(By.name("rut")).sendKeys("184873346");

        Thread.sleep(1000);

        driver.findElement(By.name("telefono")).sendKeys("998877665");

        Thread.sleep(1000);

        driver.findElement(By.name("correoElectronico")).sendKeys("test@prueba.com");

        Thread.sleep(25000);

        driver.findElement(By.id("checkPrivacidad")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("botonOculto")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[contains(text(),'RETOMAR')]")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("codSeguimiento")).sendKeys("12345678");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[contains(text(),'RETOMAR')]"));



    }
}
