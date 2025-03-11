package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaits {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            driver.get("https://www.linkedin.com");
            driver.manage().window().maximize();

            driver.navigate().to("https://github.com/");
            driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
            driver.findElement(By.id("hero_user_email")).sendKeys("mailPrueba");

            // 🔹 3️⃣ Navegar a Wikipedia y cambiar la espera implícita a 10 segundos
            driver.navigate().to("https://www.wikipedia.org/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Encontrar el campo de búsqueda, escribir "Selenium" y buscar
            WebElement searchBox = driver.findElement(By.id("searchInput"));
            searchBox.sendKeys("Selenium");
            searchBox.sendKeys(Keys.RETURN);

        }catch (NoSuchElementException e) {
            System.out.println("X Elemento no encontrado "+ e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
