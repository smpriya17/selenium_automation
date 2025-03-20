package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsPopupStepDefinition {
    WebDriver driver=Hooks.driver;

    @Given("launch popup dummy url")
    public void launchPopupDummyUrl(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
    }

    @When("alerts come")
    public void alertsCome() {
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(5));


        //switch to alert
        Alert alert=driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        alert.accept();

    }
}
