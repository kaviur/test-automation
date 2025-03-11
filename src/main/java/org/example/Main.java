package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.com");

        // Encontrar el campo de búsqueda por su ID y escribir "Java"
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("Java");

        // Encontrar el botón de búsqueda y hacer clic
        //WebElement searchButton = driver.findElement(By.cssSelector("button.pure-button.pure-button-primary-progressive"));
        WebElement searchButton = driver.findElement(By.cssSelector(".pure-form .pure-button"));
        searchButton.click();

        // Agregar una pausa para visualizar el resultado (opcional)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Cerrar el navegador
        driver.quit();


//        driver.manage().window().minimize();
//        driver.navigate().to("https://openai.com/");
//        driver.manage().window().maximize();
//        driver.navigate().to("https://github.com/");
//        driver.navigate().back();
//        driver.navigate().forward();
       driver.quit();
    }
}