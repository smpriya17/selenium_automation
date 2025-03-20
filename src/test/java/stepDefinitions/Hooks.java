package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.BrowserFactory;


import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;

   // @Before
    public void setUp() {
        String browser = System.getProperty("browser", "edge");
        System.out.println("Hooks class");// Default to Chrome
        driver = BrowserFactory.createDriver(browser);
    }

    //@After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
