package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTableStepDefinition {
    WebDriver driver = Hooks.driver;

    @Given("launch web tables dummy url")
    public void launchWebTablesDummyUrl() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
        WebElement table = driver.findElement(By.xpath(
                "/html/body/main/div/div/div[2]/form/div[2]/table"));
        List<WebElement> rows = table.findElements(By.xpath(".//tr"));

// Looping through rows and get cell values
        for (WebElement rw : rows) {
           // List<WebElement> cell = rw.findElements(By.xpath(".//td"));
            List<WebElement> cell = rw.findElements(By.xpath(".//th"));
            for (WebElement c : cell) {
                String value = c.getText();
                System.out.println("Value : "+value);
            }
        }
    }
}
