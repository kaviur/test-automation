package org.example;

import org.example.pages.W3SchoolPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert {

    private W3SchoolPage w3SchoolPage;
    private WebDriver driver;


    @BeforeEach
    public void setUp() {
        // Configurar WebDriver
        driver = new ChromeDriver();
        w3SchoolPage = new W3SchoolPage(driver, "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"); // Se inyecta WebDriver en AlertsPage
    }


    @Test
    public void TestAlert() throws InterruptedException {
        w3SchoolPage.clickTryIt();
        w3SchoolPage.handleAlert("Juan");
        Thread.sleep(5000);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
