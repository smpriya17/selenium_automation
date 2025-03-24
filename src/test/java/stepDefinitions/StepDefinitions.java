package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;


public class StepDefinitions {
    WebDriver driver = Hooks.driver;
    LoginPage loginPage=new LoginPage(driver);
    KeyDrivenFramework keyDrivenFramework =new KeyDrivenFramework();


    @Given("launch swag labs demo site")
    public void launchSwagLabsDemoSite() throws IOException {

        driver.get("https://www.saucedemo.com/");
        System.out.println("Text  : "+ driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]")).getSize());
        System.out.println("cucumber setup is successful");
        /*if( driver.getTitle().equals("Swag Labs")){
            System.out.println("Screenshot method");
            File scrnsht = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrnsht,new File("src\\test\\resources\\reports\\evidence.png"));
        }*/

    }

    @When("I enter {string} and {string}")
    public void iEnterAnd(String userName, String password) {
       loginPage.enterUserName(userName);
       loginPage.enterPassword(password);
    }

    @Then("click login")
    public void clickLogin() {
        loginPage.clickLoginButton();
        new Actions(driver)
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .perform();

    }

    @Given("read and run excel data")
    public void readAndRunExcelData() throws IOException {
        keyDrivenFramework.readAndExecuteExcelData();
    }
   //@Test(dataProvider = "loginData", dataProviderClass = TestngAnnotations.class)
    public void testLogin(String username, String password) throws IOException {
        // Perform login test
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        //take screenshot
       File scrnsht = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(scrnsht,new File("Screenshot.png"));

// handle windows
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window:allWindows){
            if(!window.equals(parentWindow)){
                driver.switchTo().window(window);
            }
        }

        //dynamic element
        driver.findElement(By.xpath("//button(contains(text(),'Login)]")).click();
        //or using explict wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicElement")));


    }



}
