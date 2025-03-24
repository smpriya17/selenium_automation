package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngTest{
    WebDriver driver =Hooks.driver;
   // @Test
    public void loginPageTitleTest(){
        driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(driver.getTitle(),"Swag Labs");
    }

   // @Test
    public void login(){
        driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(driver.getTitle(),"Swag Labs");
    }
}
