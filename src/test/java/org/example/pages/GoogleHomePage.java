package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage extends Driver {

    // Selectores de elementos
    private By searchBox = By.name("q");  // ID dinámico, mejor usar `name`
    private By logo = By.cssSelector("img.lnXdpd");

    public GoogleHomePage(WebDriver driver, String url){
        super(driver, url);
        PageFactory.initElements(driver, url);
    }

    @FindBy(id="APjFqb")
    private WebElement input;


    public String getInputValue(){
        return this.input.getDomAttribute("value");
    }

    public WebElement getInput2(){
        return input;
    }
}
