package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3SchoolPage extends Driver {

    private WebDriver driver;

    public W3SchoolPage(WebDriver driver, String url){
        super(driver, url);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.switchTo().frame("iframeResult");
    }

    // Botón "Try it"
    @FindBy(xpath = "//button[text()='Try it']")
    private WebElement tryItButton;

    // Metodo para hacer clic en el botón "Try it"
    public void clickTryIt() {
        tryItButton.click();
    }

    // Metodo para manejar la alerta
    public void handleAlert(String text) {
        driver.switchTo().alert().sendKeys(text); // Escribir en la alerta
        driver.switchTo().alert().accept(); // Hacer clic en "Aceptar"
    }
}
