package tests.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("demoqa")
public class SelenideTests extends TestBase{

    @Test
    @DisplayName("Github test")

    void shouldFindSelenideInGithub() {

        // open
        step("Open", () -> {
            open("/");
        });

        step("Search", () -> {
            $("[data-test-selector=nav-search-input]")
                    .setValue("selenide")
                    .pressEnter();
        });

        // find and click on selenide repo
        step("Select repo", () -> {
            $$(".repo-list li")
                    .first()
                    .$("a")
                    .click();
        });
        //$$(".v-align-middle").findBy(text("selenide/selenide")).click();
        // check if real selenide repo url
        step("Check ", () -> {
            $("[rel=author]")
                    .shouldHave(text("selenide"));
        });
        step("Check 1", () -> {
            $("[itemprop=name]")
                    .shouldHave(text("selenide"));
        });
        //$("h1").shouldHave(text("selenide / selenide"));
    }
}
