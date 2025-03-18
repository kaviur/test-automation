package org.example.pages;

import org.openqa.selenium.WebDriver;

public class Driver {

    private WebDriver driver;

    public Driver(WebDriver driver, String url){
        this.driver = driver;
        this.driver.get(url);
    }

    public WebDriver getDriver() {
        return driver;
    }

}
