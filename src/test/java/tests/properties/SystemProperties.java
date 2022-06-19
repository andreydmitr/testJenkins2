package tests.properties;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("test5")
public class SystemProperties {


    @Test
    void someTest1() {
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }

    @Test

    @DisplayName("TEST5")
    void someTest2() {
        String browser = System.getProperty("browser","chrome");
        String ver = System.getProperty("version","100");
        String browserSize = System.getProperty("browserSize","1280x1024");
        String anyText = System.getProperty("anyText","any");
        System.out.println(browser);
        System.out.println(ver);
        System.out.println(browserSize);
        System.out.println(anyText);
    }


}
