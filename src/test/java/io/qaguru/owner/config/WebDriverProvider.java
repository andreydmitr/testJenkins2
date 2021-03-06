package io.qaguru.owner.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    private WebDriverConfig config;

    public WebDriverProvider() {
        this.config = new WebDriverConfig();
    }


    @Override
    public WebDriver get() {
        WebDriver driver = createWebDriver();
        driver.get(config.getBaseUrl());
        return driver;
    }

    public WebDriver createWebDriver() {
        if (config.getBrowser().equals(Browser.CHROME)) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        if (config.getBrowser().equals(Browser.FIREFOX)) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        throw new RuntimeException("No such browser");
    }
}
