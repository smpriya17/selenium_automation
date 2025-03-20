package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.MouseActionsPage;


public class MouseActionsStepDefinitions {
    private WebDriver driver;
    private MouseActionsPage mouseActionsPage;

    public MouseActionsStepDefinitions() {
        this.driver = Hooks.driver;
        System.out.println("Driver in MouseActionsStepDefinitions: " + driver);
        // this.mouseActionsPage = new MouseActionsPage(driver);
    }


    @Given("launch mouse actions dummy website")
    public void launchMouseActionsDummyWebsite() {
        driver.get("https://vinothqaacademy.com/mouse-event/");
    }

    @When("move mouse to self paced video course and click SCC")
    public void moveMouseToSelfPacedVideoCourseAndClickSCC() {
        // mouseActionsPage.performMouseActions();
        WebElement selfPacedVideoCoursePath = driver.findElement(By.xpath(
                "//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/a"));
        WebElement seleniumCourseCurriculumPath = driver.findElement(By.xpath(
                "//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li[1]/a"));


        Actions actions = new Actions(driver);
        actions.moveToElement(selfPacedVideoCoursePath).moveToElement(seleniumCourseCurriculumPath)
                .click().perform();

    }

// right click step definition
    @Given("launch right click dummy url")
    public void launchRightClickDummyUrl() {
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
    }

    @Then("right click the button")
    public void rightClickTheButton() {
        WebElement rightClickElement = driver.findElement(By.cssSelector(".context-menu-one"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickElement).perform();
    }

    // drag and drop step definition
    @Then("drag and drop the element")
    public void dragAndDropTheElement() {
        WebElement source = driver.findElement(By.id("draggableElement"));
        WebElement target = driver.findElement(By.id("droppableElement"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).perform();


        // Move the mouse by an offset from the current position
        //actions.moveByOffset()
    }

    @And("double click the element")
    public void doubleClickTheElement() {
        WebElement doubleClickElementPath = driver.findElement(By.id("dblclick"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickElementPath).perform();
    }
}
