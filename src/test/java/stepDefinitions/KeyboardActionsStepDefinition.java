package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyboardActionsStepDefinition {
    WebDriver driver = Hooks.driver;
    WebElement searchBox;

    @Given("launch google browser")
    public void launchGoogleBrowser() {
       driver.get("https://www.google.com");
    }

    @When("user enter text field in search box")
    public void userEnterTextFieldInSearchBox() {
        searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchBox.sendKeys("java tutorial");
    }

    @Then("hit enter")
    public void hitEnter() {
        searchBox.sendKeys(Keys.ENTER);
    }

    @Given("launch tutorial practice form")
    public void launchTutorialPracticeForm() throws AWTException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        WebElement subjectField = driver.findElement(By.name("subjects"));
        driver.findElement(By.id("name")).sendKeys("Selenium");

        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
       // currentAddressField.isDisplayed();
        subjectField.click();
        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
// refresh the page
       action.sendKeys(Keys.F5).perform();
        //to open developer tools
         action.sendKeys(Keys.F12).perform();

      //   action.keyDown(Keys.CONTROL).sendKeys("n").keyUp(Keys.CONTROL).perform();
        //open new window using robot class
        Robot robot = new Robot();

        // Press and release CTRL + N (new window in browsers)
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_CONTROL);


    }


}
