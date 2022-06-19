package io.qaguru.owner;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qaguru.owner.config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tests.demoqa.TestBase;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {

    @AfterEach
    void afterEach() {
        driver.quit();
    }

    private WebDriver driver = new WebDriverProvider().get();

    @Test
    public void testGithubTitle() {
        String title = driver.getTitle();
        assertEquals(title, "GitHub: Where the world builds software · GitHub");

    }
}
