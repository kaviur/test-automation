package org.example;

import org.example.pages.GoogleHomePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class ApplicationTest {

    private GoogleHomePage home;
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        home = new GoogleHomePage(driver, "https://www.google.com");
    }

    @Test
    public void abrirNavegador(){
        String title = driver.getTitle();
        Assertions.assertEquals("Google maps", title, "No es igual el titulo");
        driver.quit();
    }

    @Test
    public void logo(){
        WebElement logo = driver.findElement(By.cssSelector("img.lnXdpd" ));
        String logoNombre = logo.getDomAttribute("class");
        Assertions.assertNotEquals("lnXdpd",logoNombre, "Es igual el nombre");

    }

    @Test
    public void hotmail(){

        // WebElement busqueda = driver.findElement(By.id("APjFqb" ));
        WebElement input2 = home.getInput2();
        String input = home.getInputValue();
        Assertions.assertEquals(input, "clase");
        driver.quit();


        //busqueda.sendKeys("hotmail");
        // WebElement text = driver.findElement(By.cssSelector("ul[role='listbox']li:nth-child(1)" ));
        //text.click();

    }

}

