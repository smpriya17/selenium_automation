package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By userNamePath = By.xpath("//*[@id=\"user-name\"]");
    private By passwordPath = By.xpath("//*[@id=\"password\"]");
    private By loginButton = By.xpath("//*[@id=\"login-button\"]");

    //Actions
    public void enterUserName(String userName) {
        driver.findElement(userNamePath).clear();
        driver.findElement(userNamePath).sendKeys(userName);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordPath).clear();
        driver.findElement(passwordPath).sendKeys(password);

    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

}
