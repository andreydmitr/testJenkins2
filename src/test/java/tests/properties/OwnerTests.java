package tests.properties;

import com.codeborne.selenide.Selenide;
import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class OwnerTests {


    CredentialsConfig config =
            ConfigFactory.create(CredentialsConfig.class);

    @Test
    @Tag("owner")
    void loginTest() {


        String login = config.login();
        String password = config.password();

        System.out.println("Login: " + login);
        System.out.println("Pass: " + password);

        String mess = "I log as " + login + " " + password;
        System.out.println(mess);
    }
}
