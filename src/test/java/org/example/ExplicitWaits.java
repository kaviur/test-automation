package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWaits {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // Crear instancia de WebDriverWait con un timeout de 10 segundos
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Esperar a que el cuadro de búsqueda de Google sea visible y luego escribir en él
            driver.get("https://www.google.com");

            // Esperar hasta que el campo de búsqueda sea visible
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
            searchBox.sendKeys("Selenium WebDriver");
            searchBox.sendKeys(Keys.RETURN);

            // Esperar a que el botón "Sign in" de GitHub sea clickeable antes de interactuar con él
            driver.navigate().to("https://github.com/");

            // Esperar hasta que el botón "Sign in" sea clickeable y hacer clic
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")));
            loginButton.click();

            // Esperar a que un menú desplegable en Wikipedia esté disponible
            driver.navigate().to("https://www.wikipedia.org/");

            // Esperar hasta que el menú de selección de idioma sea visible
            WebElement languageDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-lang-list-button")));
            System.out.println("✅ Menú desplegable de idioma está disponible.");

            // Generar un error cambiando un localizador incorrecto
            try {
                WebElement fakeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fakeElement")));
                fakeElement.click();
            } catch (TimeoutException e) {
                System.out.println("❌ ERROR: No se encontró el elemento esperado (se generó TimeoutException).");
            }
        }catch (NoSuchElementException e) {
            System.out.println("X Elemento no encontrado "+ e.getMessage());
        } finally {
            driver.quit();
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://www.google.com");
        }
    }
}
